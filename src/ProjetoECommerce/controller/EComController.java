package ProjetoECommerce.controller;

import java.util.ArrayList;
import ProjetoECommerce.repository.EcomRepository;

import ProjetoECommerce.model.BackLog;
import ProjetoECommerce.model.ECom;

public class EComController implements EcomRepository {
	private ArrayList<BackLog> listaBackLog = new ArrayList<BackLog>();
	String nome = "";

	@Override
	public void procurarPorCodigo(int codigo) {
		var buscarLog = buscarNaCollection(codigo);
		if (buscarLog!=null) {
			buscarLog.visualizar();
		} else
			System.out.println("\nO jogo de código: " + codigo + " não foi encontradao na lista!");
		}
	
	@Override
	public void listarTodos() {
		for (var BackLog : listaBackLog) {
			BackLog.visualizar();
		}

	}

	public void cadastrar(BackLog ECom) {
		listaBackLog.add(ECom);
		System.out.println("\nO log do jogo: " + ECom.getNome() + " foi cirado com sucesso");

	}

	@Override
	public void atualizar(ECom BackLog) {
		var buscaLog = buscarNaCollection(BackLog.getCodigo());
		
		if (buscaLog != null) {
			listaBackLog.set(listaBackLog.indexOf(buscaLog), (ProjetoECommerce.model.BackLog) BackLog);
		} else
			System.out.println("\nO log de código " + BackLog.getCodigo()+ "não foi encontrado!");

	}

	@Override
	public void deletar(int codigo) {
		var log = buscarNaCollection(codigo);
		
		if(log != null) {
			if (listaBackLog.remove(log) == true) {
				System.out.println("\nO Log código: " + codigo + " foi deletado com sucesso!");
			} else
				System.out.println("\nO Log código: " + codigo + " não foi encontrado");
		}

	}

	@Override
	public void cadastrar(ECom Ecom) {
	}

	public ECom buscarNaCollection(int codigo) {
		for (var Log : listaBackLog) {
			if (Log.getCodigo() == codigo) {
				return Log;
			}
		}
		return null;
	}



}
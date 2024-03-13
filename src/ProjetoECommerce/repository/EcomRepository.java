package ProjetoECommerce.repository;

import ProjetoECommerce.model.ECom;


public interface EcomRepository {

	public void procurarPorNome(String nome);
	public void procurarPorPlataforma(String plataforma);
	public void listarTodos();
	public void cadastrar(ECom BackLog);
	public void atualizar(ECom BackLog);
	public void deletar(String nome);
	
}

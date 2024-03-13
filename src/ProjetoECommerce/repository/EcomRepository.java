package ProjetoECommerce.repository;

import ProjetoECommerce.model.ECom;


public interface EcomRepository {

	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(ECom Ecom);
	public void atualizar(ECom ECom);
	public void deletar(int codigo);
	
}

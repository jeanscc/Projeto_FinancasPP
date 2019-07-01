package strategy;

public interface StrategyGenerico {

	public boolean salvar(Object obj)throws Exception;
	
	public Object excluir(int id) throws Exception;
	
	public Object atualizar(Object novo) throws Exception;
	
	public Object listar() throws Exception;
	
	public Object buscar(int id) throws Exception;
	
	public Object buscar(Object obj) throws Exception;
}


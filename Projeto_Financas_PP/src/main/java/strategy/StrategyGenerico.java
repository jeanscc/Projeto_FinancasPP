package strategy;

public interface StrategyGenerico {

	public boolean salvar(Object obj)throws Exception;
	
	public boolean excluir(int id) throws Exception;
	
	public boolean atualizar(Object novo) throws Exception;
	
	public Object listar() throws Exception;
}


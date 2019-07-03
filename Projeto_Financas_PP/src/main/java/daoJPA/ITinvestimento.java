package daoJPA;

import dto.InvestimentoDTO;

public interface ITinvestimento {

	public boolean salvar(InvestimentoDTO obj) throws Exception;
	
	public InvestimentoDTO atualizar(InvestimentoDTO novo) throws Exception;
	
	public InvestimentoDTO listar() throws Exception;
}

package dao;

import dto.ContaDTO;

public interface ITconta {

	public boolean salvar(ContaDTO obj) throws Exception;
	
	public boolean excluir(int id) throws Exception;
	
	public boolean atualizar(ContaDTO nova) throws Exception;
}

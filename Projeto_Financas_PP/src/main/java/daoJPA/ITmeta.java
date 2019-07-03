package daoJPA;

import dto.MetaDTO;

public interface ITmeta {

	public boolean salvar(MetaDTO obj) throws Exception;
	
	public MetaDTO listar() throws Exception;
	
	public boolean excluir(int id) throws Exception;
	
	public MetaDTO atualizar(MetaDTO novo) throws Exception;
}

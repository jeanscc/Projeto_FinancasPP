package daoJPA;

import dto.MetaDTO;

public interface ITmeta {

	public boolean salvar(MetaDTO obj) throws Exception;
	
	public MetaDTO listar() throws Exception;
	
<<<<<<< Updated upstream
	public boolean excluir(MetaDTO dto) throws Exception;
=======
	public boolean excluir(MetaDTO obj) throws Exception;
>>>>>>> Stashed changes
	
	public MetaDTO atualizar(MetaDTO novo) throws Exception;
}

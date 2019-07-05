package daoJPA;

import dto.ValorDTO;

public interface ITvalor {

	public boolean salvar(ValorDTO obj) throws Exception;
	
	public ValorDTO listar() throws Exception;
	
}

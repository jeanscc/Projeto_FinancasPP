package daoJPA;

import java.util.ArrayList;

import dto.UsuarioDTO;

public interface ITusuario {

	public boolean salvar(UsuarioDTO obj) throws Exception;

	public UsuarioDTO excluir(int id) throws Exception;

	public UsuarioDTO atualizar(UsuarioDTO obj) throws Exception;

	public UsuarioDTO listar() throws Exception;

	public UsuarioDTO buscar(int id) throws Exception;
	
	public UsuarioDTO logar(UsuarioDTO usuario) throws Exception;
	
}

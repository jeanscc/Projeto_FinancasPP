package control;

import dto.UsuarioDTO;
import model.Usuario;
import strategy.StrategyGenerico;

public class ControlerUsuario implements StrategyGenerico{
	private Usuario usuario;
	
	public ControlerUsuario() {
		usuario = new Usuario();
	}
	public boolean salvar(Object obj) throws Exception {
		UsuarioDTO novo = (UsuarioDTO) obj;
		return  usuario.salvar(novo);
	}

	public Object excluir(int id) throws Exception {
		return usuario.excluir(id);
	}

	public Object atualizar(Object novo) throws Exception {
		return usuario.atualizar((UsuarioDTO) novo);
	}

	public Object listar() throws Exception {
		return (UsuarioDTO) usuario.listar();
	}

	public Object logar(Object obj) throws Exception {
		return  usuario.logar((UsuarioDTO) obj);
	}
	public Object buscar(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

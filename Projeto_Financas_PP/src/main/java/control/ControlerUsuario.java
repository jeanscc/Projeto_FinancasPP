package control;

import dto.UsuarioDTO;
import dto.UsuarioDTO;
import model.Usuario;
import strategy.StrategyGenerico;

public class ControlerUsuario {
<<<<<<< Updated upstream

=======
	private Usuario usuario;

public class ControlerUsuario{

	
>>>>>>> Stashed changes
	private Usuario usuario;

	public ControlerUsuario() {
		usuario = new Usuario();
	}

	public boolean salvar(UsuarioDTO dto) throws Exception {
		return usuario.salvar(dto);
	}

	public UsuarioDTO excluir(UsuarioDTO dto) throws Exception {
		return usuario.excluir(dto);
	}

	public UsuarioDTO atualizar(UsuarioDTO dto) throws Exception {
		return usuario.atualizar(dto);
	}

	public UsuarioDTO listar() throws Exception {
		return usuario.listar();
	}

	public UsuarioDTO buscar(UsuarioDTO dto) throws Exception {
		return usuario.buscar(dto);
	}

	public UsuarioDTO logar(UsuarioDTO dto) throws Exception {
		return usuario.logar(dto);
	}
}

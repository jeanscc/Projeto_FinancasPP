package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bd.ConnectionFactory;
import dto.UsuarioDTO;

public class UsuarioDAO implements ITusuario {
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pst;

	public UsuarioDAO() {
		// TODO Auto-generated constructor stub
		try {
			con = ConnectionFactory.getInstance().conectar();
		} catch (Exception e) {

		}
	}

	public boolean salvar(UsuarioDTO obj) throws Exception {
		try {
			pst = con.prepareStatement("INSERT INTO usuario (nome,cpf,email,telefone, id_conta) VALUES (?,?,?,?,?)");
			pst.setString(1, obj.getNome());
			pst.setString(2, obj.getCpf());
			pst.setString(3, obj.getEmail());
			pst.setString(4, obj.getTelefone());
			pst.setInt(5, obj.getConta().getId());
			pst.execute();
			return true;
		} catch (Exception e) {
			throw new Exception("Erro ao salvar usuario. " + e.getMessage());
		}
	}

	public boolean excluir(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean atualizar(UsuarioDTO obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public UsuarioDTO listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

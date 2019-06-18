package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bd.ConnectionFactory;
import dto.ContaDTO;

public class ContaDAO implements ITconta{
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public ContaDAO() {
		// TODO Auto-generated constructor stub
		try {
			con = ConnectionFactory.getInstance().conectar();
		} catch (Exception e) {
			
		}
	}
	public boolean salvar(ContaDTO obj) throws Exception {
		try {
			pst = con.prepareStatement("INSERT INTO conta (numero,saldo) VALUES (?,?)");
			pst.setInt(1, obj.getNumero());
			pst.setDouble(2, obj.getSaldo());
			pst.execute();
			return true;
			
		}catch(Exception e) {
			throw new Exception("Erro ao salvar Conta. " + e.getMessage());
		}
	}

	public boolean excluir(int id) throws Exception {
		try {
			pst = con.prepareStatement("DELETE FROM conta WHERE id = ?");
			pst.setInt(1, id);
			pst.execute();
			return true;
		}catch(Exception e) {
			throw new Exception("Erro ao excluir Conta. " + e.getMessage());
		}
	}

	public boolean atualizar(ContaDTO nova) throws Exception {
		try {
			pst = con.prepareStatement("UPDATE conta SET saldo = ? WHERE id = ?");
			pst.setDouble(1, nova.getSaldo());
			pst.setInt(2, nova.getId());
			pst.execute();
			return true;
		}catch(Exception e) {
			throw new Exception("Erro ao atualizar dados da conta. " + e.getMessage());
		}
	}

}

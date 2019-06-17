package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bd.ConnectionFactory;
import dto.MetaDTO;

public class MetaDAO implements ITmeta{
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public MetaDAO() {
		// TODO Auto-generated constructor stub
		try {
			con = ConnectionFactory.getInstance().conectar();
		} catch (Exception e) {
			
		}
	}
	
	public int salvar(MetaDTO obj) throws Exception {
		try {
			pst = con.prepareStatement("INSERT INTO meta (id_usuario, nome, data_inicio,data_fim,valor) VALUES (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pst.setInt(1, obj.getIdUsuario());
			pst.setString(2, obj.getNome());
			pst.setDate(3, obj.getData_inicio());
			pst.setDate(4, obj.getData_fim());
			pst.execute();
			rs = pst.getGeneratedKeys();
			while(rs.next()) {
				return rs.getInt("id");
			}
		}catch(Exception e) {
			throw new Exception("Erro ao salvar meta. " + e.getMessage());
		}
		return -1;
	}

	public MetaDTO listar() throws Exception {
		MetaDTO retorno = new MetaDTO();
		ArrayList<MetaDTO> lista = new ArrayList<MetaDTO>();	
		
		try {
			pst = con.prepareStatement("SELECT *FROM meta");
			rs = pst.executeQuery();
			while(rs.next()){
				MetaDTO m = new MetaDTO();
				m.setData_fim(rs.getDate("data_fim"));
				m.setData_inicio(rs.getDate("data_inicio"));
				m.setId(rs.getInt("id"));
				m.setNome(rs.getString("nome"));
				m.setIdUsuario(rs.getInt("id_usuario"));
				lista.add(m);
			}
			retorno.setTodasMetas(lista);
			return retorno;
		}catch(Exception e) {
			throw new Exception("Erro ao listar metas. " + e.getMessage());
		}
	}

	public boolean excluir(int id) throws Exception {
		try {
			pst = con.prepareStatement("DELETE FROM meta WHERE id = ?");
			pst.setInt(1, id);
			pst.execute();
			return true;
		}catch(Exception e) {
			throw new Exception("Erro ao excluir meta. " + e.getMessage());
		}
	}

	public boolean atualizar(MetaDTO novo) throws Exception {
		try {
			pst = con.prepareStatement("UPDATE meta set nome = ?, data_fim = ? WHERE id = ?");
			pst.setString(1, novo.getNome());
			pst.setDate(2, novo.getData_fim());
			pst.execute();
			return true;
		}catch(Exception e) {
			throw new Exception("Erro ao atualizar meta. " + e.getMessage());
		}
	}

}

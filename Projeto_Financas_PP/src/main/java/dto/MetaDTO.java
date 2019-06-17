package dto;

import java.sql.Date;
import java.util.ArrayList;

public class MetaDTO {
	private Date data_inicio, data_fim;
	private String nome;
	private ArrayList<MetaDTO> todasMetas;
	private int id, idUsuario;
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<MetaDTO> getTodasMetas() {
		return todasMetas;
	}

	public void setTodasMetas(ArrayList<MetaDTO> todasMetas) {
		this.todasMetas = todasMetas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
}

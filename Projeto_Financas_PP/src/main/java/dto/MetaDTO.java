package dto;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MetaDTO {
	
	private Date data_inicio;
	
	private Date data_fim;
	
	private String nome;
	
	@Transient
	private ArrayList<MetaDTO> todasMetas;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private int idUsuario;
	
	
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

package dto;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MetaDTO {
	
	@Column(name = "data_inicio")
	private Date data_inicio;
	
	@Column(name = "data_fim")
	private Date data_fim;
	
	@Column(name = "nome")
	private String nome;
	
	private ArrayList<MetaDTO> todasMetas;
	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	@Column(name = "idUsuario")
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

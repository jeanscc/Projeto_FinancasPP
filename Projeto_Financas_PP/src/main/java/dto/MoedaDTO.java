package dto;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import model.TipoMoeda;

@Entity
@Table(name = "moeda")
public class MoedaDTO {

	private String nome;
	@Enumerated(EnumType.STRING)
	private TipoMoeda tipo;
	
	private double valor;
	
	@Transient
	private ArrayList<ValorDTO> valores = new ArrayList<ValorDTO>();
	
	
	
	@Transient
	private ArrayList<MoedaDTO> todasMoedas;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<MoedaDTO> getTodasMoedas() {
		return todasMoedas;
	}

	public void setTodasMoedas(ArrayList<MoedaDTO> todasMoedas) {
		this.todasMoedas = todasMoedas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoMoeda getTipo() {
		return tipo;
	}

	public void setTipo(TipoMoeda moeda) {
		this.tipo = moeda;
	}

	public ArrayList<ValorDTO> getValores() {
		return valores;
	}

	public void setValores(ArrayList<ValorDTO> valores) {
		this.valores = valores;
	}
	
	

	
}

package dto;

import java.util.ArrayList;

public class MoedaDTO {

	private String nome;
	private double valor;
	private ArrayList<MoedaDTO> todasMoedas;
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

}

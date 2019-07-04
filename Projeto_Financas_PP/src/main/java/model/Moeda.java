package model;

import java.util.ArrayList;

public class Moeda  {
	private String nome;
	private TipoMoeda tipo;
	private ArrayList<Valor> historico = new ArrayList<Valor>();
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoMoeda getTipo() {
		return tipo;
	}
	public void setTipo(TipoMoeda tipo) {
		this.tipo = tipo;
	}
	public ArrayList<Valor> getHistorico() {
		return historico;
	}
	public void setHistorico(ArrayList<Valor> historico) {
		this.historico = historico;
	}
	
	
	
	
	
	
	
}

package model;

import java.util.Date;

import daoJPA.ITvalor;
import daoJPA.ValorDaoJPA;
import dto.ValorDTO;

public class Valor {
	private ITvalor valordao;
	private double valor;
	private Date data;

	public Valor() {
		valordao = new ValorDaoJPA();
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public boolean salvar(ValorDTO obj) throws Exception {
		return valordao.salvar(obj);
	}
	
	public ValorDTO listar() throws Exception {
		return valordao.listar();
	}
	
}

package dto;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import model.Moeda;

@Entity
public class InvestimentoDTO {
	
	private String status;
	
	private double valor;
	
	private Date data_inicio;
	private Date data_fim;
	
	@Transient
	private ArrayList<InvestimentoDTO> todosInvetismento;
	

	private MoedaDTO moeda;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public MoedaDTO getMoedaDTO() {
		return moeda;
	}

	public void setMoeda(MoedaDTO moeda) {
		this.moeda = moeda;
	}

	public ArrayList<InvestimentoDTO> getTodosInvetismento() {
		return todosInvetismento;
	}

	public void setTodosInvetismento(ArrayList<InvestimentoDTO> todosInvetismento) {
		this.todosInvetismento = todosInvetismento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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

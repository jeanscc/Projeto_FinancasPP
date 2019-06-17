package dto;

import java.util.ArrayList;
import java.util.Date;

public class InvestimentoDTO {
	private String status;
	private double valor;
	private Date data_inicio, data_fim;
	private ArrayList<InvestimentoDTO> todosInvetismento;
	private int idMeta, idMoeda, id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMeta() {
		return idMeta;
	}

	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
	}

	public int getIdMoeda() {
		return idMoeda;
	}

	public void setIdMoeda(int idMoeda) {
		this.idMoeda = idMoeda;
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

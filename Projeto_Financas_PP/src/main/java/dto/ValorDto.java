package dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ValorDto {
	
	private double valor;
	
	@OneToOne
	private MoedaDTO moeda;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public MoedaDTO getMoeda() {
		return moeda;
	}

	public void setMoeda(MoedaDTO moeda) {
		this.moeda = moeda;
	}
	
	
	
}

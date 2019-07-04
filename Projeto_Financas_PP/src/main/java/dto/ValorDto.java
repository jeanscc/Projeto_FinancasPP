package dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ValorDto {
	
	private double valor;
	
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
	
}

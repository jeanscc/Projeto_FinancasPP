package control;

import dto.ValorDTO;
import model.Valor;

public class ValorControl {
	private Valor valor;
	
	public ValorControl() {
		valor = new Valor();
	}
	
	public boolean salvar(ValorDTO obj) throws Exception {
		return valor.salvar(obj);
	}
	
	public ValorDTO listar() throws Exception {
		return valor.listar();
	}
}

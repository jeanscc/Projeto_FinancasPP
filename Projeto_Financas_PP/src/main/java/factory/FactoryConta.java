package factory;

import control.ControlerConta;
import dto.ContaDTO;
import model.Conta;

public class FactoryConta implements ITfabrica{

	public Object gerar(String tipo) {
		if(tipo.equalsIgnoreCase("control")) {
			return new ControlerConta();
		}else if(tipo.equalsIgnoreCase("dto")) {
			return new ContaDTO();
		}else if(tipo.equalsIgnoreCase("model")) {
			return new Conta();
		}
		return null;
	}

}

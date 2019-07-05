package control;

import model.requisicoes.ITrequeste;
import model.requisicoes.RequisicaoDolar;

public class FachadaRequisicoes {
	ITrequeste request;
	
	public String recuperarDolar() {
		request = new RequisicaoDolar();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

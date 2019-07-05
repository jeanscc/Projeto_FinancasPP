package control;

import java.text.Format;

import model.requisicoes.ITrequeste;
import model.requisicoes.RequisicaoBCash;
import model.requisicoes.RequisicaoBitCoin;
import model.requisicoes.RequisicaoDolar;
import model.requisicoes.RequisicaoDolarCan;
import model.requisicoes.RequisicaoEthereum;
import model.requisicoes.RequisicaoEuro;
import model.requisicoes.RequisicaoLibra;
import model.requisicoes.RequisicaoLiteCoin;
import model.requisicoes.RequisicaoXRP;

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
	
	public String recuperarBCash() {
		request = new RequisicaoBCash();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarBitCoin() {
		request = new RequisicaoBitCoin();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarDolarCan() {
		request = new RequisicaoDolarCan();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarEthereum() {
		request = new RequisicaoEthereum();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarEuro() {
		request = new RequisicaoEuro();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarLibra() {
		request = new RequisicaoLibra();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarLiteCoin() {
		request = new RequisicaoLiteCoin();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String recuperarXRP() {
		request = new RequisicaoXRP();
		try {
			return request.consultarValor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public String[] recuperarRequisicoes() {
		String[] requisicoes = new String[9];
		requisicoes[0] = this.recuperarBCash();
		requisicoes[1] = this.recuperarBitCoin();
		requisicoes[2] = this.recuperarDolar();
		requisicoes[3] = this.recuperarDolarCan();
		requisicoes[4] = this.recuperarEthereum();
		requisicoes[5] = this.recuperarEuro();
		requisicoes[6] = this.recuperarLibra();
		requisicoes[7] = this.recuperarLiteCoin();
		requisicoes[8] = this.recuperarXRP();
		return requisicoes;
	}
}

package main;


import model.requisicoes.RequisicaoDolarCan;
import model.requisicoes.RequisicaoHttpMoedas;

public class Teste {

	public static void main(String[] args) {
		RequisicaoHttpMoedas teste = new RequisicaoDolarCan();
		try {
			System.out.print(teste.consultarValor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

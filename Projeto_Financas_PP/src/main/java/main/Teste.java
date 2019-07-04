package main;

import daoJPA.MoedaDaoJPA;
import dto.MoedaDTO;
import model.TipoMoeda;

public class Teste {

	public static void main(String[] args) {
		MoedaDaoJPA dao = new MoedaDaoJPA();
		MoedaDTO dto = new MoedaDTO();
		dto.setNome("Dolar");
		dto.setTipo(TipoMoeda.Moeda);
		dto.setValor(4.12);
		try {
			dao.salvar(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

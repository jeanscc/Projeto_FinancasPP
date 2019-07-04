package control;

import dto.MoedaDTO;

import model.Moeda;


public class ControlerMoeda{

	private Moeda moeda;
	
	public ControlerMoeda() {
		moeda = new Moeda();
	}
	
	public boolean salvar(MoedaDTO dto) throws Exception {
			return moeda.salvar(dto);
	}

	public boolean excluir(MoedaDTO dto) throws Exception {
			return moeda.excluir(dto);
	}

	public MoedaDTO atualizar(MoedaDTO dto) throws Exception {
			return moeda.atualizar(dto);
	}

	public MoedaDTO listar() throws Exception {
			return moeda.listar();
	}

//	public Object buscar(MoedaDTO dto) throws Exception {
//			return moeda.buscar(dto);
//	}

//	public Object logar(MoedaDTO dto) throws Exception {
//			return moeda.logar(dto);
//	}

}

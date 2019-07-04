package control;

import dto.InvestimentoDTO;
import model.Investimento;


public class ControlerInvestimento{
	Investimento investimento = new Investimento();
	
	public boolean salvar(InvestimentoDTO dto) throws Exception {
		try {
			return investimento.salvar(dto);
		} catch (Exception e) {
			throw e;
		}
	}

//	public InvestimentoDTO excluir(InvestimentoDTO dto) throws Exception {
//		try {
//			return investimento.excluir(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}

	public InvestimentoDTO atualizar(InvestimentoDTO dto) throws Exception {
		try {
			return investimento.atualizar(dto);
		} catch (Exception e) {
			throw e;
		}
	}

	public InvestimentoDTO listar() throws Exception {
		try {
			return investimento.listar();
		} catch (Exception e) {
			throw e;
		}
	}

//	public InvestimentoDTO buscar(InvestimentoDTO dto) throws Exception {
//		try {
//			return investimento.buscar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}

//	public InvestimentoDTO logar(InvestimentoDTO dto) throws Exception {
//		try {
//			return investimento.logar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}

}

package control;

import dto.MetaDTO;
import model.Meta;
import strategy.StrategyGenerico;

public class ControlerMeta{

	Meta meta = new Meta();
	
	public boolean salvar(MetaDTO dto) throws Exception {
		try {
			return meta.salvar(dto);
		} catch (Exception e) {
			throw e;
		}
	}

	public MetaDTO excluir(MetaDTO dto) throws Exception {
		try {
			return meta.excluir(dto);
		} catch (Exception e) {
			throw e;
		}
	}

	public MetaDTO atualizar(MetaDTO dto) throws Exception {
		try {
			return meta.atualizar(dto);
		} catch (Exception e) {
			throw e;
		}
	}

	public MetaDTO listar() throws Exception {
		try {
			return meta.listar();
		} catch (Exception e) {
			throw e;
		}
	}

//	public Object buscar(MetaDTO dto) throws Exception {
//		try {
//			return meta.buscar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}
//
//	public Object logar(MetaDTO dto) throws Exception {
//		try {
//			return meta.logar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}

}

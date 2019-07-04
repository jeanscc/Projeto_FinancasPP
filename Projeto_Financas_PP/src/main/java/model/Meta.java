package model;

import java.sql.Date;

import daoJPA.ITmeta;
import daoJPA.MetaDaoJPA;
import dto.MetaDTO;

public class Meta {
	private Date data_inicio, data_fim;
	private String nome, descricao;
	
	ITmeta dao = new MetaDaoJPA();
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	public boolean salvar(MetaDTO dto) throws Exception {
		try {
			return dao.salvar(dto);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public MetaDTO listar() throws Exception {
		try {
			return dao.listar();
		} catch (Exception e) {
			throw e;
		}
	}

	public MetaDTO excluir(MetaDTO dto) throws Exception {
		try {
			return dao.excluir(dto);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public MetaDTO atualizar(MetaDTO dto) throws Exception {
		try {
			return dao.atualizar(dto);
		} catch (Exception e) {
			throw e;
		}
	}

//	public MetaDTO buscar(MetaDTO dto) throws Exception {
//		try {
//			return dao.buscar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}
//
//	public MetaDTO logar(MetaDTO dto) throws Exception {
//		try {
//			return dao.logar(dto);
//		} catch (Exception e) {
//			throw e;
//		}
//	}

}

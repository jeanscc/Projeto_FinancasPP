package model;

import java.sql.Date;

import daoJPA.ITmeta;
import daoJPA.ITmoeda;
import daoJPA.MetaDaoJPA;
import daoJPA.MoedaDaoJPA;
import dto.MetaDTO;

public class Meta {
	private Date data_inicio, data_fim;
	private String nome, descricao;

	private ITmeta metaDAO;

	public Meta() {
		metaDAO = new MetaDaoJPA();
	}

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

		return metaDAO.salvar(dto);

	}

	public MetaDTO listar() throws Exception {

		return metaDAO.listar();

	}

	public MetaDTO excluir(MetaDTO dto) throws Exception {

		return metaDAO.excluir(dto);

	}

	public MetaDTO atualizar(MetaDTO dto) throws Exception {

		return metaDAO.atualizar(dto);

	}

//	public MetaDTO buscar(MetaDTO dto) throws Exception {
//		
//			return dao.buscar(dto);
//		
//	}
//
//	public MetaDTO logar(MetaDTO dto) throws Exception {
//		
//			return dao.logar(dto);
//		
//	}

}

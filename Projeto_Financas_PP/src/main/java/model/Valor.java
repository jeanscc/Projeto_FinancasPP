package model;


import java.util.Date;

import daoJPA.ITvalor;
import daoJPA.MoedaDaoJPA;
import daoJPA.ValorDaoJPA;
import dto.MoedaDTO;
import dto.ValorAtualDTO;
import dto.ValorDTO;
import model.requisicoes.FachadaRequisicoes;

public class Valor {
	private ITvalor valordao;
	private double valor;
	private Date data;

	public Valor() {
		valordao = new ValorDaoJPA();
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public boolean salvar(ValorDTO obj) throws Exception {
		return valordao.salvar(obj);
	}
	
	public ValorDTO listar() throws Exception {
		return valordao.listar();
	}
	
	public void atualizarValores() {
		Date data = new Date();
		ValorDTO dto =  new ValorDTO();
		try{
			dto = this.listar();
		
			
		
		}catch(Exception e) {
			e.getMessage();
	}
		if(!dto.getValoresCadastrados().isEmpty()) {
		for(ValorDTO valor:dto.getValoresCadastrados()) {
			this.data=valor.getData();
		}
		
		if(this.data != data) {
			FachadaRequisicoes fachada = new FachadaRequisicoes();
			ValorAtualDTO valor = fachada.recuperarRequisicoes();
			
			ValorDaoJPA vdao = new ValorDaoJPA();
			MoedaDaoJPA mdao = new MoedaDaoJPA();
			MoedaDTO moeda = null;
			try {
				moeda = mdao.listar();
			}catch(Exception e) {
				
			}
			
			for(MoedaDTO m: moeda.getTodasMoedas()) {
				switch (m.getNome()) {
				case"BCash":
					ValorDTO vdto = new ValorDTO();
					vdto.setData(data);
					vdto.setMoeda(m);
					vdto.setValor(Double.parseDouble(valor.getBCash()));
					try{
						vdao.salvar(vdto);
					}catch(Exception e) {
						
					}
					break;
				case"BitCoin":
					ValorDTO bvdto = new ValorDTO();
					bvdto.setData(data);
					bvdto.setMoeda(m);
					bvdto.setValor(Double.parseDouble(valor.getBitCoin()));
					try{
						vdao.salvar(bvdto);
					}catch(Exception e) {
						
					}
					break;
				case"Dolar":
					ValorDTO dvdto = new ValorDTO();
					dvdto.setData(data);
					dvdto.setMoeda(m);
					dvdto.setValor(Double.parseDouble(valor.getDolar()));
					try{
						vdao.salvar(dvdto);
					}catch(Exception e) {
						
					}
					break;
				
				case"DolarCan":
					ValorDTO cvdto = new ValorDTO();
					cvdto.setData(data);
					cvdto.setMoeda(m);
					cvdto.setValor(Double.parseDouble(valor.getDolarCan()));
					try{
						vdao.salvar(cvdto);
					}catch(Exception e) {
						
					}
					break;
				
				case"Ethereum":
					ValorDTO evdto = new ValorDTO();
					evdto.setData(data);
					evdto.setMoeda(m);
					evdto.setValor(Double.parseDouble(valor.getEthereum()));
					try{
						vdao.salvar(evdto);
					}catch(Exception e) {
						
					}
					break;
				case"Euro":
					ValorDTO euvdto = new ValorDTO();
					euvdto.setData(data);
					euvdto.setMoeda(m);
					euvdto.setValor(Double.parseDouble(valor.getEuro()));
					try{
						vdao.salvar(euvdto);
					}catch(Exception e) {
						
					}
					break;
				
				case"Libra":
					ValorDTO lvdto = new ValorDTO();
					lvdto.setData(data);
					lvdto.setMoeda(m);
					lvdto.setValor(Double.parseDouble(valor.getLibra()));
					try{
						vdao.salvar(lvdto);
					}catch(Exception e) {
						
					}
					break;
				
				case"LiteCoin":
					ValorDTO lcvdto = new ValorDTO();
					lcvdto.setData(data);
					lcvdto.setMoeda(m);
					lcvdto.setValor(Double.parseDouble(valor.getLiteCoin()));
					try{
						vdao.salvar(lcvdto);
					}catch(Exception e) {
						
					}
					break;
					
				case"XRP":
					ValorDTO xvdto = new ValorDTO();
					xvdto.setData(data);
					xvdto.setMoeda(m);
					xvdto.setValor(Double.parseDouble(valor.getXRP()));
					try{
						vdao.salvar(xvdto);
					}catch(Exception e) {
						
					}
					break;
				}
			}
			
		}
	}
	}
}


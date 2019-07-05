package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import daoJPA.ITinvestimento;
import daoJPA.ITmoeda;
import daoJPA.InvestimentoDaoJPA;
import daoJPA.MoedaDaoJPA;
import dto.InvestimentoDTO;
import dto.LucroDTO;


public class Investimento {
	private String nome;
	private Status status;
	private ArrayList <Lucro> lucro;
	private double margemLucro;
	private double valorInvestido;
	private double valorInvestimento;
	private Usuario usuario;
	private Date data_inicio, data_fim;
	
	private ITinvestimento investimentoDAO;
	
	public Investimento() {
		investimentoDAO = new InvestimentoDaoJPA();
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Lucro> getLucro() {
		return lucro;
	}

	public void setLucro(ArrayList<Lucro> lucro) {
		this.lucro = lucro;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getValorInvestido() {
		return valorInvestido;
	}
	
	public double getValorInvestimento() {
		return valorInvestimento;
	}
	public void setValorInvestimento(double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}
	public void setValorInvestido(double valor) {
		this.valorInvestido = valor;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public boolean salvar(InvestimentoDTO dto) throws Exception {
		
			return investimentoDAO.salvar(dto);
		
		
	}
	
	public boolean excluir(InvestimentoDTO dto) throws Exception {
		
			return investimentoDAO.excluir(dto);
	
		
	}
	
	public InvestimentoDTO atualizar(InvestimentoDTO dto) throws Exception {
		
			return investimentoDAO.atualizar(dto);
	
	}
	
	public InvestimentoDTO listar() throws Exception {
		
			return investimentoDAO.listar();
	
	}

	public InvestimentoDTO buscar(InvestimentoDTO dto) throws Exception {
	
			return investimentoDAO.buscar(dto);
	
	}
	
//	public InvestimentoDTO logar(InvestimentoDTO dto) throws Exception {
//
//			return investimentoDAO.logar(dto);
//	
//	}
	
	public InvestimentoDTO calcularMargemDeLucro(InvestimentoDTO dto) {
		InvestimentoDTO investimento = null;
        try {
           investimento = investimentoDAO.buscar(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        double valorFinal = 0;
        for( LucroDTO lucros : investimento.getLucro()) {
            valorFinal = lucros.getValor();
        }
        valorFinal = valorFinal + investimento.getValor();
        double valorInicial =  investimento.getValor();

        investimento.setMargem(((valorFinal - valorInicial)/valorInicial)*100);

        return investimento;

    }
	
}

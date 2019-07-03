package dto;

import java.util.ArrayList;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class UsuarioDTO {
	
	private String nome;
	
	private String cpf;

	private String telefone;
	
	private String email;
	
	private ContaDTO conta;
	
	private String senha;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Transient
	private ArrayList<UsuarioDTO> usuariosCadastrados;
	private Random gerador = new Random();
	
	public UsuarioDTO() {
		conta = new ContaDTO();
		conta.setSaldo(0);
		conta.setNumero(gerador.nextInt(1000000));
	}
	
	
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public ArrayList<UsuarioDTO> getUsuariosCadastrados() {
		return usuariosCadastrados;
	}
	public void setUsuariosCadastrados(ArrayList<UsuarioDTO> usuariosCadastrados) {
		this.usuariosCadastrados = usuariosCadastrados;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContaDTO getConta() {
		return conta;
	}
	public void setConta(ContaDTO conta) {
		this.conta = conta;
	}
	
}

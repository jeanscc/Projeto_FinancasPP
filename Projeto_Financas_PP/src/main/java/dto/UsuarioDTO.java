package dto;

import java.util.ArrayList;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UsuarioDTO {
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "conta")
	private ContaDTO conta;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private ArrayList<UsuarioDTO> usuariosCadastrados;
	private Random gerador = new Random();
	
	public UsuarioDTO() {
		conta = new ContaDTO();
		conta.setSaldo(0);
		conta.setNumero(gerador.nextInt(1000000));
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

package model;

import java.awt.Image;
import java.util.ArrayList;

import daoJPA.UsuarioDaoJPA;
import daoRelacional.ITusuario;
import daoRelacional.UsuarioDAO;
import dto.UsuarioDTO;

public class Usuario {
	private String nome, cpf, telefone, email;
	private Image foto;
	
	private ITusuario usuarioDAO;
	
	public Usuario() {
		usuarioDAO = new UsuarioDAO();
	}
	

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
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
 //////////////////////////////////////////////////////////////////////////////////////////////

	public boolean salvar(UsuarioDTO obj) throws Exception{
		return usuarioDAO.salvar(obj);
	}
	
	public boolean atualizar(UsuarioDTO novo) throws Exception{
		return usuarioDAO.atualizar(novo);
	}
	
	
	public UsuarioDTO logar(UsuarioDTO obj) throws Exception{
		return usuarioDAO.logar(obj);
	}
	
	public UsuarioDTO listar() throws Exception{
		return usuarioDAO.listar();
	}
	
	public boolean excluir(int id) throws Exception {
		return usuarioDAO.excluir(id);
	}
}


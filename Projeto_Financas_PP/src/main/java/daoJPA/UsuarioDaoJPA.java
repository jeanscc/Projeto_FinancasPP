package daoJPA;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import dto.UsuarioDTO;

public class UsuarioDaoJPA extends FactoryEntity implements ITusuario{
	
	private EntityManager entidade;
	
	
	public boolean salvar(UsuarioDTO obj) throws Exception {
		try {
			entidade = super.getIntity();
			entidade.getTransaction().begin();
			entidade.persist(obj);
			entidade.getTransaction().commit();
			return true;
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		}finally {
			entidade.close();
		}
	}

	public UsuarioDTO excluir(int id) throws Exception {
		UsuarioDTO achado = null;
		try {
			achado = entidade.find(UsuarioDTO.class, id);
			entidade = super.getIntity();
			entidade.getTransaction().begin();
			entidade.remove(achado);
			entidade.getTransaction().commit();
			
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		}finally {
			entidade.close();
		}
		return achado;
	}

	public UsuarioDTO atualizar(UsuarioDTO obj) throws Exception {
		try {
			entidade = super.getIntity();
			entidade.getTransaction().begin();
			obj = entidade.merge(obj);
			entidade.getTransaction().commit();
			
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		}finally {
			entidade.close();
		}
		return obj;
	}

	public UsuarioDTO listar() throws Exception {
		UsuarioDTO retorno = new UsuarioDTO();
		ArrayList<UsuarioDTO> lista;
		try {
			entidade = super.getIntity();
			lista = (ArrayList<UsuarioDTO>) entidade.createQuery("from UsuarioDTO").getResultList();
			retorno.setUsuariosCadastrados(lista);
			
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}finally {
			entidade.close();
		}
		return retorno;
	}

	public UsuarioDTO buscar(int id) throws Exception {
		UsuarioDTO retorno = null;
		ArrayList<UsuarioDTO> lista;
		try {
			entidade = super.getIntity();
			retorno = entidade.find(UsuarioDTO.class, id);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}finally {
			entidade.close();
		}
		return retorno;
	}

}

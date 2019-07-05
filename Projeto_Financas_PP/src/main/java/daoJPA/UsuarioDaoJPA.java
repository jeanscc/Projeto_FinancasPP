package daoJPA;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import antlr.collections.List;
import dto.UsuarioDTO;

public class UsuarioDaoJPA extends FactoryEntity implements ITusuario {

	private EntityManager entidade;

	public boolean salvar(UsuarioDTO obj) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			entidade.persist(obj);
			entidade.getTransaction().commit();
			return true;
		} catch (Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		} finally {
			entidade.close();
		}
	}

	public UsuarioDTO excluir(UsuarioDTO obj) throws Exception {
		UsuarioDTO achado = null;
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			entidade.remove(achado);
			entidade.getTransaction().commit();

		} catch (Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		} finally {
			entidade.close();
		}
		return achado;
	}

	public UsuarioDTO atualizar(UsuarioDTO obj) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			obj = entidade.merge(obj);
			entidade.getTransaction().commit();

		} catch (Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception(e.getMessage());
		} finally {
			entidade.close();
		}
		return obj;
	}

	public UsuarioDTO listar() throws Exception {
		UsuarioDTO retorno = new UsuarioDTO();
		ArrayList<UsuarioDTO> lista;
		entidade = super.getIntity();
		try {
			lista = (ArrayList<UsuarioDTO>) entidade.createQuery("from UsuarioDTO").getResultList();
			retorno.setUsuariosCadastrados(lista);

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return retorno;
	}

	public UsuarioDTO buscar(UsuarioDTO obj) throws Exception {
		UsuarioDTO retorno = null;
		entidade = super.getIntity();
		try {
			retorno = entidade.find(UsuarioDTO.class, obj.getId());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return retorno;
	}

	public UsuarioDTO logar(UsuarioDTO usuario) throws Exception {
		entidade = super.getIntity();
		try {
			return entidade.find(UsuarioDTO.class, usuario.getEmail());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} 
	}

	@Override
	public UsuarioDTO buscarPorEmail(UsuarioDTO dto) throws Exception {
		entidade = super.getIntity();
		ArrayList<UsuarioDTO> registros = null;
		UsuarioDTO retorno = new UsuarioDTO();
		try {
			registros = (ArrayList<UsuarioDTO>) entidade.createQuery("select u from UsuarioDTO u where u.email = '" + dto.getEmail() + "'").getResultList();
			retorno.setUsuariosCadastrados(registros);
		} catch (Exception e) {
			throw new Exception("Erro ao buscar usuário por e-mail. " +e.getMessage());
		}finally {
			entidade.close();
		}
		return filtrador(registros, dto);
	}
	
	private UsuarioDTO filtrador(ArrayList<UsuarioDTO> registro, UsuarioDTO alvo) {
		for(UsuarioDTO x : registro) {
			if(x.getEmail().equalsIgnoreCase(alvo.getEmail())) {
				return x;
			}
		}
		return null;
	}
}

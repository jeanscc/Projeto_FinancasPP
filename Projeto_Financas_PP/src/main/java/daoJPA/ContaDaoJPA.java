package daoJPA;

import javax.persistence.EntityManager;

import dto.ContaDTO;

public class ContaDaoJPA extends FactoryEntity implements ITconta {
	private EntityManager entidade;
	
	
	public boolean salvar(ContaDTO obj) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			entidade.persist(obj);
			entidade.getTransaction().commit();
			return true;
		}catch(Exception e) {
			throw new Exception("Erro o salvar conta. " + e.getMessage());
		}finally {
			entidade.close();
		}
	}

	public boolean excluir(int id) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			ContaDTO achada = entidade.find(ContaDTO.class, id);
			entidade.remove(achada);
			entidade.getTransaction().commit();
			return true;
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception("Erro ao excluir conta. " + e.getMessage());
		}
	}

	public ContaDTO atualizar(ContaDTO nova) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			nova = entidade.merge(nova);
			entidade.getTransaction().commit();
			return nova;
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception("Erro ao atualizar conta. " + e.getMessage());
		}finally {
			entidade.close();
		}
		
	}

}

package daoJPA;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import dto.ValorDTO;

public class ValorDaoJPA extends FactoryEntity implements ITvalor{
	private EntityManager entidade;
	
	
	@Override
	public boolean salvar(ValorDTO obj) throws Exception {
		entidade = super.getIntity();
		entidade.getTransaction().begin();
		try {
			entidade.persist(obj);
			entidade.getTransaction().commit();
			return true;
		}catch(Exception e) {
			entidade.getTransaction().rollback();
			throw new Exception("Erro ao salvar valor. " + e.getMessage());
		}finally {
			entidade.close();
		}
	}

	@Override
	public ValorDTO listar() throws Exception {
		entidade = super.getIntity();
		ValorDTO retorno = new ValorDTO();
		ArrayList<ValorDTO> valores = null;
		try {
			valores = (ArrayList<ValorDTO>) entidade.createQuery("from ValorDTO m").getResultList();
			retorno.setValoresCadastrados(valores);
		}catch(Exception e) {
			throw new Exception("Erro ao consultara valores. " + e.getMessage());
		}finally {
			entidade.close();
		}
		return retorno;
	}

}

package bd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class ConnectionEntityManager {

	private static final EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("bd");
	
	public static EntityManager getIntity() {
		return fabrica.createEntityManager();
	}
	
}

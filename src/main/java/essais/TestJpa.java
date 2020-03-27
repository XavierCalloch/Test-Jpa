package essais;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		
		// Construction de l'usine à EntityManager (EntityManagerFactory - vie durant toute l'application)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		
		// Obtention d'une instance d'EntityManager (idéalement durée de vie courte)
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Fermeture EntityManager
		entityManager.close();

		// A la fin de l'application, fermeture de l'EntityManagerFactory
		entityManagerFactory.close();

	}

}

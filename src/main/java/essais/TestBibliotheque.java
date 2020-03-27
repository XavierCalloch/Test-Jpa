package essais;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.Emprunt;

public class TestBibliotheque {
	
	private static final Logger LOGGER = Logger.getLogger(TestBibliotheque.class.getName());

	public static void main(String[] args) {

		// Construction de l'usine à EntityManager (EntityManagerFactory - vie durant
		// toute l'application)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");

		// Obtention d'une instance d'EntityManager (idéalement durée de vie courte)
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Utilisation de l'EntityManager pour échanger avec la base de données

		// On fait une requête JPQL pour extraire un emprunt et tous ses livres associés
		TypedQuery<Emprunt> query = entityManager.createQuery("select e from Emprunt e where e.id = :id",
				Emprunt.class);
		query.setParameter("id", 1);

		Emprunt myEmprunt = query.getResultList().get(0);
		
		LOGGER.log(Level.INFO, myEmprunt.getLivres().toString());

		// Fermeture EntityManager
		entityManager.close();

		// Instanciation d'une 2ème instance d'EntityManager
		entityManager = entityManagerFactory.createEntityManager();

		// On fait une requête JPQL pour extraire tous les emprunts d’un client donné
		query = entityManager.createQuery("select e from Emprunt e join e.client c where c.id = :id",
				Emprunt.class);
		query.setParameter("id", 1);

		List<Emprunt> myListeEmprunts = query.getResultList();
		
		for (Emprunt e : myListeEmprunts) {
			LOGGER.log(Level.INFO, e.toString());
		}

		// Fermeture EntityManager
		entityManager.close();

		// A la fin de l'application, fermeture de l'EntityManagerFactory
		entityManagerFactory.close();

	}

}

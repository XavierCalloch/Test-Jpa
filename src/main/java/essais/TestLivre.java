package essais;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.Livre;

public class TestLivre {

	private static final Logger LOGGER = Logger.getLogger(TestLivre.class.getName());

	public static void main(String[] args) {

		// Construction de l'usine à EntityManager (EntityManagerFactory - vie durant
		// toute l'application)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");

		// Obtention d'une instance d'EntityManager (idéalement durée de vie courte)
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Utilisation de l'EntityManager pour échanger avec la base de données

		// On extrait un livre en fonction de son id
		Livre livre1 = entityManager.find(Livre.class, 1);

		LOGGER.log(Level.INFO, "Id du livre: " + livre1.getId() + " - Titre du livre: " + livre1.getTitre()
				+ " - Auteur du livre: " + livre1.getAuteur());

		// On fait une requête JPQL pour trouver un LIVRE en fonction de son TITRE
		TypedQuery<Livre> query = entityManager
				.createQuery("select l from Livre l where l.titre = 'Vingt mille lieues sous les mers'",
						Livre.class);
		List<Livre> myListeLivres = query.getResultList();
		
		for (Livre livre : myListeLivres) {
			LOGGER.log(Level.INFO, "Id du livre: " + livre.getId() + " - Titre du livre: " + livre.getTitre()
			+ " - Auteur du livre: " + livre.getAuteur());
		}

		// Fermeture EntityManager
		entityManager.close();

		// A la fin de l'application, fermeture de l'EntityManagerFactory
		entityManagerFactory.close();

	}

}

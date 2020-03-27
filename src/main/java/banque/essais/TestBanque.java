package banque.essais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.entites.Adresse;
import banque.entites.Banque;
import banque.entites.Client;
import banque.entites.Compte;
import banque.entites.Operation;

public class TestBanque {

	public static void main(String[] args) {

		// Construction de l'usine à EntityManager (EntityManagerFactory - vie durant
		// toute l'application)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_banque");

		// Obtention d'une instance d'EntityManager (idéalement durée de vie courte)
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// On insère de nouvelles données en base

		EntityTransaction tx1 = entityManager.getTransaction();
		tx1.begin();

		Banque nouvelleBanque = new Banque("Crédit Mutuel");
		entityManager.persist(nouvelleBanque);

		Client nouveauClient = new Client("Monceau", "François", LocalDate.of(1970, Month.APRIL, 17),
				new Adresse(5, "rue de l'océan", 56100, "Lorient"));
		entityManager.persist(nouveauClient);

		Compte nouveauCompte = new Compte("015912347", 200.00);
		entityManager.persist(nouveauCompte);

		Operation newOperation = new Operation(LocalDateTime.of(2020, Month.FEBRUARY, 4, 15, 45, 28), 100.00,
				"Achat billet train");
		entityManager.persist(newOperation);

		tx1.commit();

		// Fermeture EntityManager
		entityManager.close();

		// A la fin de l'application, fermeture de l'EntityManagerFactory
		entityManagerFactory.close();

	}

}

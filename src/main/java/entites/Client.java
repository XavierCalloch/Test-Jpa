package entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Représente un client
 * 
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "client")
public class Client {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	/** nom */
	@Column(name = "NOM")
	private String nom;

	/** prenom */
	@Column(name = "PRENOM")
	private String prenom;

	/** emprunts du client */
	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunts; // ou List<Emprunt>

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
		emprunts = new HashSet<Emprunt>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id     id
	 * @param nom    nom
	 * @param prenom prénom
	 */
	public Client(Integer id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " - Nom: " + getNom() + " - Prénom: " + getPrenom();
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the emprunts
	 */
	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	/**
	 * Setter
	 * 
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}

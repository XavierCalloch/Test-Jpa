package entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Représente un livre
 * 
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "livre")
public class Livre {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	/** titre */
	@Column(name = "TITRE")
	private String titre;

	/** auteur */
	@Column(name = "AUTEUR")
	private String auteur;

	/** emprunt associé */
	@ManyToMany(mappedBy = "livres")
	private Set<Emprunt> emprunts;

	/**
	 * Constructeur
	 * 
	 */
	public Livre() {

	}

	/**
	 * Constructeur
	 * 
	 * @param id     id
	 * @param titre  titre
	 * @param auteur auteur
	 */
	public Livre(Integer id, String titre, String auteur) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " - Titre: " + getTitre() + " - Auteur: " + getAuteur();
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter
	 * 
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
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

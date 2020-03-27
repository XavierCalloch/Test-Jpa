package banque.entites;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Représente un client
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "client")
public class Client {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** nom */
	@Column(name = "nom")
	private String nom;
	
	/** prénom */
	@Column(name = "prenom")
	private String prenom;
	
	/** date de naissance */
	@Column(name = "date_naissance")
	private LocalDate dateNaissance;
	
	/** adresse */
	@Embedded
	private Adresse adresse;
	
	/** banque associée */
	@ManyToOne
	@JoinColumn(name = "id_banque")
	private Banque banque;
	
	/** comptes associés */
	@ManyToMany
	@JoinTable(name = "client_compte", joinColumns = @JoinColumn(name = "id_cli", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_cpt", referencedColumnName = "id"))
	private Set<Compte> comptes;
	
	/** Constructeur
	 * 
	 */
	public Client() {
		
	}
	
	/** Constructeur
	 * @param nom			nom
	 * @param prenom		prénom
	 * @param dateNaissance	date de naissance
	 */
	public Client(String nom, String prenom, LocalDate dateNaissance, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}

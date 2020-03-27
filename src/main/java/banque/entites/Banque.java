package banque.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Représente une banque
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "banque")
public class Banque {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** nom */
	@Column(name = "nom")
	private String nom;
	
	/** clients associés */
	@OneToMany(mappedBy = "banque")
	private Set<Client> clients;
	
	/** Constructeur
	 * 
	 */
	public Banque() {
		clients = new HashSet<Client>();
	}
	
	/** Constructeur
	 * @param nom	nom
	 */
	public Banque(String nom) {
		this.nom = nom;
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

}

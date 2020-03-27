package banque.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Représente un compte
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "compte")
public class Compte {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** numéro */
	@Column(name = "numero")
	protected String numero;
	
	/** solde */
	@Column(name = "solde")
	protected Double solde;
	
	/** clients associés */
	@ManyToMany(mappedBy = "comptes")
	private Set<Client> clients;
	
	/** opérations associées */
	@OneToMany(mappedBy = "compte")
	private Set<Operation> operations;
	
	/** Constructeur
	 * 
	 */
	public Compte() {
		operations = new HashSet<Operation>();
	}

	
	/** Constructeur
	 * @param numero	numéro
	 * @param solde		solde
	 */
	public Compte(String numero, Double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	/** Getter
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
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

package banque.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Représente une opération
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "operation")
public class Operation {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/** date */
	@Column(name = "date")
	protected LocalDateTime date;
	
	/** montant */
	@Column(name = "montant")
	protected Double montant;
	
	/** motif */
	@Column(name = "motif")
	protected String motif;
	
	/** compte associé */
	@ManyToOne
	@JoinColumn(name = "id_compte")
	private Compte compte;
	
	/** Constructeur
	 * 
	 */
	public Operation() {
		
	}
	
	/** Constructeur
	 * @param date		date
	 * @param montant	montant
	 * @param motif		motif
	 */
	public Operation(LocalDateTime date, Double montant, String motif) {
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}

	/** Getter
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/** Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/** Getter
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
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

package banque.entites;

import java.time.LocalDateTime;

/** Représente un virement
 * @author Xavier CALLOCH
 *
 */
public class Virement extends Operation {
	
	/** bénéficiaire */
	private String beneficiaire;
	
	/** Constructeur
	 * 
	 */
	public Virement() {
		
	}
	
	/** Constructeur
	 * @param date			date
	 * @param montant		montant
	 * @param motif			motif
	 * @param beneficiaire	bénéficiaire
	 */
	public Virement(LocalDateTime date, Double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
	}

	/** Getter
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/** Setter
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}

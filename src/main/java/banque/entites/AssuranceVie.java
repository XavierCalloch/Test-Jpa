package banque.entites;

import java.time.LocalDate;

/** Représente une assurance-vie
 * @author Xavier CALLOCH
 *
 */
public class AssuranceVie extends Compte {
	
	/** date de fin */
	private LocalDate dateFin;
	
	/** taux */
	private Double taux;
	
	/** Constructeur
	 * 
	 */
	public AssuranceVie() {
		
	}
	
	/** Constructeur
	 * @param numero	numéro
	 * @param solde		solde
	 * @param dateFin	date de fin
	 * @param taux		taux
	 */
	public AssuranceVie(String numero, Double solde, LocalDate dateFin, Double taux) {
		super(numero, solde);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

}

package banque.entites;

/** Représente un livret A
 * @author Xavier CALLOCH
 *
 */
public class LivretA extends Compte {
	
	/** taux */
	private Double taux;
	
	/** Constructeur
	 * 
	 */
	public LivretA() {
		
	}
	
	/** Constructeur
	 * @param numero	numéro
	 * @param solde		solde	
	 * @param taux		taux	
	 */
	public LivretA(String numero, Double solde, Double taux) {
		super(numero, solde);
		this.taux = taux;
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

package banque.entites;

import javax.persistence.Embeddable;

/** Représente une adresse postale
 * @author Xavier CALLOCH
 *
 */
@Embeddable
public class Adresse {
	
	/** numéro */
	private Integer numero;
	
	/** rue */
	private String rue;
	
	/** code postal */
	private Integer codePostal;
	
	/** ville */
	private String ville;
	
	/** Constructeur
	 * 
	 */
	public Adresse() {
		
	}
	
	/** Constructeur
	 * @param numero		numéro
	 * @param rue			rue
	 * @param codePostal	code postal
	 * @param ville			ville
	 */
	public Adresse(Integer numero, String rue, Integer codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/** Getter
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/** Setter
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Getter
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}

	/** Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/** Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}

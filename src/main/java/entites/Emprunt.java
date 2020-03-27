package entites;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Représente un emprunt
 * 
 * @author Xavier CALLOCH
 *
 */
@Entity
@Table(name = "emprunt")
public class Emprunt {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	/** date de début */
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;

	/** délai */
	@Column(name = "DELAI")
	private Integer delai;

	/** date de fin */
	@Column(name = "DATE_FIN")
	private Date dateFin;

	/** client associé */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/** livres associés */
	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private Set<Livre> livres;

	/**
	 * Constructeur
	 * 
	 */
	public Emprunt() {

	}

	/**
	 * Constructeur
	 * 
	 * @param id        id
	 * @param dateDebut date de début
	 * @param delai     délai
	 * @param dateFin   date de fin
	 */
	public Emprunt(Integer id, Date dateDebut, Integer delai, Date dateFin) {
		this.id = id;
		this.dateDebut = dateDebut;
		this.delai = delai;
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " - Date début: " + getDateDebut() + " - Délai: " + getDelai() + " - Date fin: "
				+ getDateFin();
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
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * 
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/** Getter
	 * @return the livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}

	/** Setter
	 * @param livres the livres to set
	 */
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

}

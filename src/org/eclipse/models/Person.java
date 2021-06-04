package org.eclipse.models;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 */
public class Person {
	
	/** The num. */
	private int num;
	
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The adresse. */
	private Adresse adresse;
	
	/**
	 * Instantiates a new person.
	 *
	 * @param num the num
	 * @param nom the nom
	 * @param prenom the prenom
	 */
	public Person(int num, String nom, String prenom) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Instantiates a new person.
	 *
	 * @param num the num
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param adresse the adresse
	 */
	public Person(int num, String nom, String prenom, Adresse adresse) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	
	public Person(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Instantiates a new person.
	 */
	public Person() {
		super();
	}

	/**
	 * Gets the num.
	 *
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Sets the num.
	 *
	 * @param num the new num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Person [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

}

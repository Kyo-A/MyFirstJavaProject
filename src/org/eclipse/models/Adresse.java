package org.eclipse.models;

import org.eclipse.exceptions.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Adresse.
 */
public class Adresse {
	
	/** The rue. */
	private String rue;
	
	/** The code postal. */
	private String codePostal;
	
	/** The ville. */
	private String ville;
	
	/**
	 * Instantiates a new adresse.
	 *
	 * @param rue the rue
	 * @param codePostal the code postal
	 * @param ville the ville
	 * @throws AdresseException the adresse exception
	 */
	
	public Adresse(String rue, String codePostal, String ville) throws AdresseException {
		
//		if(!rue.equals(rue.toUpperCase()))
//			throw new IncorrectStreetNameException(rue);
		
//		if(codePostal.length() != 5)
//			throw new IncorrectCodePostalException(codePostal);
		
		if (codePostal.length() != 5 || !rue.equals(rue.toUpperCase())) {
			throw new AdresseException(codePostal, rue);
		}
		
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	/**
	 * Instantiates a new adresse.
	 */
	public Adresse() {
		super();
	}

	/**
	 * Gets the rue.
	 *
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	
	/**
	 * Sets the rue.
	 *
	 * @param rue the new rue
	 * @throws IncorrectStreetNameException the incorrect street name exception
	 */
	public void setRue(String rue) throws IncorrectStreetNameException {
//		if(!rue.equals(rue.toUpperCase()))
//			throw new IncorrectStreetNameException(rue);
		this.rue = rue;
	}
	
	/**
	 * Gets the code postal.
	 *
	 * @return the code postal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	
	/**
	 * Sets the code postal.
	 *
	 * @param codePostal the new code postal
	 * @throws IncorrectCodePostalException the incorrect code postal exception
	 */
	public void setCodePostal(String codePostal) throws IncorrectCodePostalException {
//		if(codePostal.length() != 5)
//			throw new IncorrectCodePostalException(codePostal);
		this.codePostal = codePostal;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

}

package org.eclipse.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IncorrectStreetNameException.
 */
public class IncorrectStreetNameException extends Exception {

	/**
	 * Instantiates a new incorrect street name exception.
	 *
	 * @param nom the nom
	 */
	public IncorrectStreetNameException(String nom) {

		System.out.println("Le nom " + nom + " de la rue doit etre en majuscule");
	}
}

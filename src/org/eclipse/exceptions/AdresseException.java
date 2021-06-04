package org.eclipse.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class AdresseException.
 */
public class AdresseException extends Exception{
	
	/**
	 * Instantiates a new adresse exception.
	 *
	 * @param cp the cp
	 * @param rue the rue
	 */
	public AdresseException(String cp, String rue) {
		if (cp.length() != 5) {
			System.out.println("Le code postal " + cp + " doit contenir exactement 5 chiffres ");
		}
		if (!rue.equals(rue.toUpperCase())) {
			System.out.print("Le nom de la rue " + rue + " doit etre en majuscule ");
		}
	}
}

package org.eclipse.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IncorrectCodePostalException.
 */
public class IncorrectCodePostalException extends Exception {

	/**
	 * Instantiates a new incorrect code postal exception.
	 *
	 * @param cp the cp
	 */
	public IncorrectCodePostalException(String cp) {
		
		System.out.println("Le code postal " + cp + " doit contenir exactement 5 chiffres");
	}
}

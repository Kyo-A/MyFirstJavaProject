

package org.eclipse.utils;

import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {

	// Constantes en JAVA => Une fois que vous d�clarez une variable final, vous ne pouvez pas modifier sa valeur. 
	// Si vous essayez de le faire, une erreur de compilation sera g�n�r�e.
	
	private static final String ADRESSE = "jdbc:mysql://localhost:3306/formation_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static Connection Conn;
	
	public static Connection getConnection() {
		try {
			Conn = DriverManager.getConnection(ADRESSE, USER, PASSWORD);
			return Conn;
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Connexion � la bd impossible");
		}
		return null;
	}
	
}

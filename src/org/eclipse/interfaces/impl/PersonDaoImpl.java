package org.eclipse.interfaces.impl;

import java.sql.*;

import java.util.*;

import javax.swing.JOptionPane;

import org.eclipse.interfaces.IDao;
import org.eclipse.models.Person;
import org.eclipse.utils.MyConnection;

public class PersonDaoImpl implements IDao<Person> {

	List<Person> listPersonne = new ArrayList<>();

	// JDBC => Java Database Connectivity
	// API => Acc�s auc bd avec Java

	// importer le MySql driven.jar ds le buildpath

	@Override
	public Person save(Person personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				// PreparedStatement est utilis� pour ex�cuter des requ�tes sp�cifiques qui sont
				// cens�es s'ex�cuter de mani�re r�p�t�e
				// Cette requ�te peut �tre ex�cut�e plusieurs fois pour r�cup�rer les d�tails de
				// diff�rents personnes.

				// En utilisant PreparedStatement comme ci-dessous, la base de donn�es aide � la
				// pr�paration des requ�tes,
				// ce qui est plus rapide et plus s�curis�.

//            	PreparedStatement pst = c.prepareStatement("INSERT INTO personne(nom, prenom) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

				PreparedStatement pst = c.prepareStatement("INSERT INTO personne(nom, prenom) VALUES (?, ?)");

//            	pst.setInt(1, personne.getNum());
				pst.setString(1, personne.getNom());
				pst.setString(2, personne.getPrenom());

				// Envoie le PreparedStatement
				pst.executeUpdate();

//            	ResultSet resultat = pst.getGeneratedKeys();

				pst.close();
				return personne;

			} catch (SQLException ex) {

				JOptionPane.showMessageDialog(null, "probl�me avec save()" + ex.getMessage(), "Probl�me rencontr�",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

	@Override
	public boolean remove(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) { // test if connection to BDD is not null
			try { // try/catch to BDD
				PreparedStatement pst = c.prepareStatement("DELETE FROM personne WHERE id = ?");
				pst.setInt(1, id);
				int rows = pst.executeUpdate();
				if (rows == 1)
					return true;
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "probl�me avec delEditor()" + ex.getMessage(), "Probl�me rencontr�",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return false;
	}

	@Override
	public Person update(Person person) {
		Connection c = MyConnection.getConnection();
		if (c != null) { // test if connection to BDD is not null
			try { // try/catch to BDD
				PreparedStatement pst = c.prepareStatement("UPDATE personne SET nom = ?, prenom = ? WHERE id = ?");
				pst.setString(1, person.getNom());
				pst.setString(2, person.getPrenom());
				pst.setInt(3, person.getNum());
				int rows = pst.executeUpdate();
				if (rows == 1)
					return person;
				pst.close();
				return person;// close the statement
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "probl�me avec updateEditor()" + ex.getMessage(),
						"Probl�me rencontr�", JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

	@Override
	public Person findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from personne where id = ?; ");
				ps.setInt(1, id);
				// Les instances de l'interface ResultSet contiennent les r�sultats d'une
				// requ�te SQL.
				// Ils contiennent les tuples (lignes) satisfaisant aux conditions de la
				// requ�te.
				ResultSet r = ps.executeQuery();
				if (r.next())
					return new Person(r.getInt("id"), r.getString("nom"), r.getString("prenom"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Person> getAll() {
		Connection c = MyConnection.getConnection();
		if (c != null) { // test if connection to BDD is not null
			try { // try/catch to BDD
				PreparedStatement pst = c.prepareStatement("SELECT * FROM personne");
				ResultSet rs = pst.executeQuery();
				this.listPersonne = new ArrayList<>();
				while (rs.next()) { // loop for read the content of the answer from BDD
					int num = rs.getInt("id");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					this.listPersonne.add(new Person(num, nom, prenom));
				}
				return listPersonne;
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "probl�me avec recupAllEditor()" + ex.getMessage(),
						"Probl�me rencontr�", JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

}

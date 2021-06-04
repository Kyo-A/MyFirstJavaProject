package org.eclipse.main;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;
import org.eclipse.interfaces.impl.PersonDaoImpl;
import org.eclipse.models.Adresse;
import org.eclipse.models.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App extends JFrame {

	// En Java, chaque instruction se termine par un ;
	// Il faut preciser obligatoirement le type de chaque variable
	// Une variable peut avoir des valeurs differentes mais ne pourra pas changer de
	// type

	// public indique que le main est accessible a partir d'autres classes
	// static permet d'invoquer la methode sans instancier l'bjet de la classe
	// void signifie une methode qui n'attends pas type de retour

	// String[] args => mecanisme pour que le systeme passe des informations a votre
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	// application.
	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		System.out.println("-----------------------Variables, Types, ...-------------------------------------------");
		
//		// Pour afficher un message, il faut utiliser la classe System
//		// La classe System a deux objets pour l’entree/sortie (in/out)
//		// L’objet out a plusieurs methodes d’affichage comme print() et println()
//		System.out.println("Hello from ze console !");
//
//		// Type primitif int
//		int x = 5;
//		System.out.println(x);
//
//		// type Objet Integer => Wrapper des types primitifs
//		Integer w = 4;
//		System.out.println(w);
//
//		// Declaration d'une variable de type chaìne de caractere
//		String mot = new String();
//		mot = "Bonjour";
//		System.out.println(mot);
//		// Ou
//		String mot2 = new String("Bonjour2");
//		System.out.println(mot2);
//		// Ou encore
//		String mot3 = "Bonjour3";
//		System.out.println(mot3);
//
//		// Types primitif vs Type objets
//		// - Les types primitifs sont moins couteux en memoire
//		// - Les types objets offrent plusieurs methodes a appliquer sur les valeurs
//
//		// replace(old, new) => Renvoie une nouvelle chaîne où
//		// tous les caractères "jour" sont remplacés par des caractères "soir":
//		String str = "Bonjour les bons jours";
//		String str2 = str.replace("jour", "soir");
//		System.out.println(str2); // Affiche bonsoir les bons soirs
//
//		// indexOf() : Recherche une chaîne pour la première occurrence
//		// qui prend en 1er param => Une valeur String, représentant la chaîne à
//		// rechercher
//		// 2eme param => Une valeur int, représentant la position d'index à partir de
//		// laquelle
//		// démarrer la recherche
//		int pos = str.indexOf("bon", 1);
//		System.out.println(pos); // Affiche 12
//
//		// Exemple de conversion de Integer en String
//		Integer y = 2;
//		String str3 = y.toString();
//		System.out.println(str3); // Affiche 2
//
//		// Possibilite de concatener des valeurs
//		String string = "bon";
//		String string2 = "jour";
//		System.out.println(string + string2); // affiche bonjour
//
//		// Classe Scanner
//		// - permet de lire une valeur saisie par l’utilisateur dans la console
//		// - il faut preciser le type de la valeur a recuperer
//		System.out.println("-----------------------SCANNER-------------------------------------------");
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Veuillez saisir un premier nombre, svp");
//		int nbr1 = sc.nextInt();
//		System.out.println("Veuillez saisir un deuxieme nombre, svp");
//		int nbr2 = sc.nextInt();
//
//		int res = nbr1 + nbr2;
//		System.out.println("La somme de " + nbr1 + " et " + nbr2 + " vaut " + res);
//		System.out.printf("la somme de %d et de %d vaut %d\n", nbr1, nbr2, res);
//
//		System.out.print("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println("My name is " + name);
//
//		System.out.println("-----------------------EXOS-------------------------------------------");
//
//		System.out.print("Enter a number you want to check: ");
//
//		int num = sc.nextInt();
//
//		String[] r = { "Positive", "Negative" };
//		// shift operator >>
//		// L'opérateur de décalage droit signé ">>" décale un modèle de bits vers la
//		// droite.
//		System.out.println(r[(num >> 31) & 1]);
//
//		Scanner in = new Scanner(System.in);
//		System.out.print("Input number: ");
//		int input = in.nextInt();
//		if (input > 0) {
//			System.out.println("Number is positive");
//		} else if (input < 0) {
//			System.out.println("Number is negative");
//		} else {
//			System.out.println("Number is zero");
//		}
//
//		System.out.print("Input the 1st number: ");
//		int num1 = in.nextInt();
//		System.out.print("Input the 2nd number: ");
//		int num2 = in.nextInt();
//		System.out.print("Input the 3rd number: ");
//		int num3 = in.nextInt();
//
//		if (num1 > num2)
//			if (num1 > num3)
//				System.out.println("The greatest: " + num1);
//		if (num2 > num1)
//			if (num2 > num3)
//				System.out.println("The greatest: " + num2);
//		if (num3 > num1)
//			if (num3 > num2)
//				System.out.println("The greatest: " + num3);
//
//		int result = Math.max(Math.max(num1, num2), num3);
//
//		System.out.print(result);
//
//		// Ecrire un code Java qui permet d’afficher les nombres pairs compris entre 0
//		// et 10.
//
//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//		
//		System.out.println("-----------------------POO----------------------------------------------");
//
//		// Cree une instance de la classe Person
//		// Ou cree un objet de type Person
//		Person person = new Person();
//		person.setNum(1);
//		person.setNom("Doe");
//		person.setPrenom("John");
//		System.out.println("-----------------------OBJECT-------------------------------------------");
//
//		// Affiche l'objet de type Person (methode object ToString())
//		System.out.println(person);
//
//		// Affichage grace aux Getters declarés dans la CLasse Person
//		System.out.println(person.getNum() + " " + person.getNom() + " " + person.getPrenom());
//
//		Person p2 = new Person(2, "Wick", "John");
//		System.out.println(p2);
//
//		System.out.println("-----------------------ARRAY-------------------------------------------");
//
//		Person[] personTab = new Person[2];
//
//		personTab[0] = new Person(3, "Ford", "John");
//
//		Person p3 = new Person(4, "Wayne", "John");
//
//		personTab[1] = p3;
//
//		for (Person i : personTab) {
//			System.out.println(i);
//		}
//
//		System.out.println("-----------------------LISTE-------------------------------------------");
//
//		List<Person> persons = new ArrayList<Person>();
//		persons.add(person);
//		persons.add(p2);
//		persons.add(p3);
//
//		for (Person i : persons) {
//			System.out.println(i);
//		}
//
//		System.out.println("-----------------------LISTE-------------------------------------------");
//
//		persons.forEach(p -> System.out.println(p));

//		Definir une classe Adresse avec trois attributs prives (rue,
//		codePostal et ville de type chaıne de caractere
//		Definir un constructeur avec trois parametres, les getters, les
//		setters et la methode toString()
//		Dans la classe Personne, ajouter un attribut adresse de type
//		Adresse et definir un nouveau constructeur a quatre parametres
//		et le getter et le setter de ce nouvel attribut
//		Dans la classe Main, creer deux objets, un objet de type
//		Adresse et un de type Personne et lui attribuer l’adresse creee
//		precedemment
//		Afficher tous les attributs de cet objet de la classe Personne

//		Person p5 = new Person(5, "Travolta", "John", new Adresse("rue de rivoli", "75001", "Paris"));
//
//		Adresse a1 = new Adresse("rue de rivoli", "75001", "Paris");
//		Person p6 = new Person(6, "Cena", "John", a1);
//
//		System.out.println(p5);
//		System.out.println(p6);
//		
//		System.out.println("-----------------------METHODES-------------------------------------------");
//
//		
//		System.out.println("Le prix TTC est de : " + totalTTC(150.6f, 20f));
//		
//		int choix = 0;
//		conditionSeason(choix);
//		

		System.out.println("-----------------------EXCEPTIONS-------------------------------------------");

//		Une exception, c’est quoi ?

//		C’est une erreur qui se produit pendant l’execution de notre
//		programme
//		Une exception dans un programme implique generalement son
//		arret d’execution

//		Comment faire pour poursuivre l’execution?

//		Reperer les blocs pouvant generer une exception
//		Capturer l’exception correspondante
//		Afficher un message relatif a cette exception
//		Continuer l’execution

//		int x = 5, y = 0;
//		System.out.println(x/y);
//		System.out.println("Fin de calcul"); // le message fin de calcul n'a pas ete affichée

//		Comment faire pour capturer une exception ?

//		Utiliser un bloc try{} catch {}

//		Le try{} pour entourer une instruction susceptible de
//		declencher une exception

//		Le catch {} pour capturer l’exception et afficher un
//		message qui lui correspond

//		int x = 5, y = 0;
//		try {
//			System.out.println(x / y);
//		} catch (Exception e) {
////			System.out.println("Exception : Division par Zero");
////			System.out.println("Exception :" + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("Fin de calcul");

//		Supposons que
//		codePostal doit contenir exactement 5 chiffres
//      rue doit etre une chaıne en majuscule

//		Demarche a faire
//		Creer notre propre exception (qui doit etendre la classe
//		Exception)

//		Dans le constructeur de Adresse, on lance une exception si
//		codePostal ne contient pas 5 chiffres

// 		Gere les exceptions les unes apres les autres

//		try {
//			Adresse a = new Adresse("rue", "0600", "VILLE1");
//		} catch (AdresseException ex) {
//			ex.printStackTrace();
//		}
//		// La clause finally s'exécute après le bloc try et après le bloc catch (si
//		// celui-ci a été déclenché)
//		// mais avant les instructions qui suivent.
//		// Les instructions de cette clause sont toujours exécutées
//		// , qu'il y ait eu ou non une exception de déclenchée et/ou d'interceptée
//		finally {
//			System.out.println("Instruction executee systematiquement");
//		}
//
//		System.out.println("Fin de l'insertion");

// OU  

//		try { 
//			 Adresse a = new Adresse("rue", "06000", "VILLE1");
//		}
//		catch(IncorrectStreetNameException | IncorrectCodePostalException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Fin de l'insertion");

//		Creer une nouvelle classe d’exception AdresseException pour
//		fusionner et remplacer les deux exceptions
//		IncorrectCodePostalException et
//		IncorrectStreetNameException

		// Appel de la classe PersonneDao implementant l'interface IDAO<> pour avoir
		// access
		// au Données (DAO => DATA ACCESS OBJECT)

//		PersonDaoImpl personDaoImpl = new PersonDaoImpl();
//
//		System.out.println("---------------------------------SAVE---------------------------------------");
//
//		Person p = new Person("Wick", "John");
//
//		Person savedPerson = personDaoImpl.save(p);
//
////		ImageIcon icon = new ImageIcon("images/cook.png");
//
//		if (savedPerson != null) {
////			JOptionPane.showMessageDialog(null, "Personne insérée" + savedPerson, "SUCCESS", JOptionPane.INFORMATION_MESSAGE, icon);
//			JOptionPane.showMessageDialog(null, "Personne insérée" + savedPerson, "SUCCESS",
//					JOptionPane.INFORMATION_MESSAGE);
//
//		} else {
//			JOptionPane.showMessageDialog(null, "problème avec insertedPersonne" + savedPerson, "Problème rencontré",
//					JOptionPane.ERROR_MESSAGE);
//		}
//
//		System.out.println("---------------------------------GETALL-------------------------------------");
//
//		List<Person> personnes = personDaoImpl.getAll();
//		personnes.forEach(persons -> System.out.println(persons));
//
//		System.out.println("---------------------------------DELETE-------------------------------------");
//
//		boolean test = personDaoImpl.remove(31);
//
//		if (test) {
//			JOptionPane.showMessageDialog(null, "Personne supprimée avec succes", "Success", JOptionPane.OK_OPTION);
//		} else {
//			JOptionPane.showMessageDialog(null, "Suppression impossible", "Error", JOptionPane.ERROR_MESSAGE);
//		}
//
//		System.out.println("---------------------------------FINDBYID-----------------------------------");
//
//		Person person = personDaoImpl.findById(5);
//
//		if (p != null) {
//			JOptionPane.showMessageDialog(null, "Personne trouvée : " + person, "Success", JOptionPane.OK_OPTION);
//		} else {
//			JOptionPane.showMessageDialog(null, "problème avec findById" + person, "Error", JOptionPane.ERROR_MESSAGE);
//		}
//
//		System.out.println("---------------------------------UPDATE-------------------------------------");
//
//		p.setNum(18);
//		p.setNom("Pon");
//		p.setPrenom("Pon");
//		Person personUpdated = personDaoImpl.update(p);
//
//		JOptionPane.showMessageDialog(null, "Personne mise a jour : " + personUpdated, "Avec succes",
//				JOptionPane.OK_OPTION);
//		
		
		System.out.println("---------------------------------COLLECTIONS-------------------------------------");

		
//		Plusieurs types de collections proposes
		
//		List : tableaux extensibles a volonte, accessibles via leurs indice
//		ou valeur
		
//		ArrayList
		
//		Pas de limite de taille
//		Possibilit ´e de stocker tout type de donn´ees (y compris null)
		
		List<String> strings = new ArrayList<String>();
		
		strings.add("CHAINE1");
		strings.add("CHAINE2");
		
//		strings.remove(0);
		
		strings.set(1, "bonsoir");
		
		// forEach() -> Itere chaque element de la liste et appelle 
		// l'expression Lambda (JAVA 8) specifie par l'action, ici SYSOUT
		
		strings.forEach(s -> System.out.println(s));
		
		// ou JAVA 8 Reference de methode
		strings.forEach(System.out::println);

//		LinkedList (ou bien liste chaınee en francais)
//		C’est une liste dont chaque element a deux references : une vers
//		l’ element precedent et la deuxieme vers l’ element suivant.
		
//		addFirst(object) : insere l’ element object au debut de la
//		liste
		
//		addLast(object) : insere l’ element object comme dernier
//		element de la liste (exactement comme add())
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		String s = "e";
		linkedList.add("");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.addLast("d");
		linkedList.addFirst(s);
		
		linkedList.remove("a");
		linkedList.remove(s);
		
//		On peut parcourir une liste chaınee avec un Iterator
//		Un iterateur est un objet qui a pour role de parcourir une collection
		
		ListIterator<String> li = linkedList.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		// Pour convertir un tableau en Liste
		
		Integer[] tab = {2, 3, 4, 5, 6};
		List<Integer> ints = Arrays.asList(tab);
		
		ints.forEach(System.out::println);
		
		// On peut le faire sans creer le tableau
		List<Integer> ints2 = Arrays.asList(2, 3, 4, 5, 6);
		
		ints2.forEach(System.out::println);
		
//		HashSet
		
//		Collection utilisant une table de hachage
//		Possibilite de parcourir ce type de collection avec un objet
//		Iterator
//		Possibilite d’extraire de cet objet un tableau d’Object	
//		HashSet n'autorise pas les doublons.
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("av");
		hs.add("zv");
		hs.add("yv");
		hs.add("bv");
		hs.add("cv");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}


	/**
	 * Total TTC.
	 *
	 * @param somme       the somme
	 * @param pourcentage the pourcentage
	 * @return the float
	 */
	public static float totalTTC(float somme, float pourcentage) {
		float total = somme + (somme * (pourcentage / 100));
		return total;
	}

	// Créer un programme qui demande un entier à l’utilisateur puis qui affiche
	// dans quelle saison on se trouve pour la valeur rentrée.

	/**
	 * Lire valider entier.
	 *
	 * @param debut the debut
	 * @param fin   the fin
	 * @return the int
	 */
	public static int lireValiderEntier(int debut, int fin) {
		int choix;
		boolean valeur = false;
		Scanner clavier = new Scanner(System.in);
		do {
			System.out.print("\n\n\tEntrez le nombre :");
			choix = clavier.nextInt();
			if (choix >= 0 && choix <= 12)
				valeur = true;
			else {
				System.out.print("\n\n\tRefaire le choix :");
				valeur = false;
			}
		} while (!valeur);
		return choix;
	}

	/**
	 * Condition season.
	 *
	 * @param choix the choix
	 */
	public static void conditionSeason(int choix) {
		do {
			afficherMenu();
			choix = lireValiderEntier(1, 12);
			if (choix >= 1 & choix <= 3) {
				System.out.println("\n\n\tNous sommes en Hiver");
			} else if (choix >= 4 & choix <= 6) {
				System.out.println("\n\n\tNous sommes en Printemps");
			} else if (choix >= 7 & choix <= 9) {
				System.out.println("\n\n\tNous sommes en Ete");
			} else if (choix >= 10 & choix <= 12) {
				System.out.println("\n\n\tNous sommes en Automne");
			} else {
				System.out.println("\n\n\tCIAO!");
			}
		} while (choix != 0);
	}

	/**
	 * Afficher menu.
	 */
	public static void afficherMenu() {
		System.out.println("\n\n\n\t\tMENU PRINCIPAL\n");
		System.out.println("\t1. Preciser un entier selon un mois de l'année\n");
		System.out.println("\t0. Quitter\n");
		System.out.print("\tFaites votre choix : ");
	}

}

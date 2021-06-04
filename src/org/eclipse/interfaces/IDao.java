package org.eclipse.interfaces;

import java.util.List;

// GENERICITE

// si on a besoin d’une interface dont les methodes effectuent les
// memes operations quel que soit le type d’attributs, on utilise la GENERICITE

// Ne pas definir de type pour les attributs

// Definir un type generique qui ne sera pas precise a la creation de
// la classe

// A l’instanciation de la classe, on precise le type a utiliser par cette
// classe

// On peut donc choisir pour chaque instance le type que l’on
// souhaite utiliser.

public interface IDao<T> {
	
	T save(T object);

	boolean remove(int id);

	T update(T object);

	T findById(int id);

	List<T> getAll();

}

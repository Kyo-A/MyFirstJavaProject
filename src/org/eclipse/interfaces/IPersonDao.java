package org.eclipse.interfaces;

import java.util.List;

import org.eclipse.models.Person;

public interface IPersonDao {
	
	Person save(Person p);
	
	boolean remove(int id);
	
	Person update(Person p);
		
	Person finById(int id);
	
	List<Person> getAll();

}

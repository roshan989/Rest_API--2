package com.rk.pkg.dao;

import java.util.List;
import java.util.UUID;

import com.rk.pkg.model.Person;

public interface PersonDao {
	int insertPerson(String id,Person person);
	
	default int insertPerson(Person person) {
		String id=UUID.randomUUID().toString();
		return insertPerson(id,person);
	}
	
	List<Person> selectAllPerson();
}

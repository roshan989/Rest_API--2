package com.rk.pkg.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.rk.pkg.model.Person;

@Repository("FakeDao")
public class FakePersonDataService implements PersonDao {
	public static List<Person> DB=new ArrayList<>();
	@Override
	public int insertPerson(String id, Person person) {
		DB.add(new Person(id,Person.getName()));
		//System.out.println("in post");
		return 1;
	}
	@Override
	public List<Person> selectAllPerson() {
		//System.out.println("in get");
		return DB;
	}

}

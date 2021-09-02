package com.rk.pkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rk.pkg.dao.PersonDao;
import com.rk.pkg.model.Person;

@Service
public class PersonService {
	private final PersonDao personDao;
	 
	@Autowired
	public PersonService(@Qualifier("FakeDao") PersonDao personDao) {
		this.personDao=personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		//System.out.println("in get2");
		return personDao.selectAllPerson();
	}
}

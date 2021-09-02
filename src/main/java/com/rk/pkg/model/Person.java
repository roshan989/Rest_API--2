package com.rk.pkg.model;




import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	public static String id;
	
	public static String name;
	
	public Person(@JsonProperty("id") String id,@JsonProperty("name") String name) {
		Person.name=name;
		Person.id=id;
	}
	public static String getId() {
		return id;
	}

	public static String getName() {
		return name;
	}

	

}

package com.example.RestApi.mocks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.RestApi.model.Person;

public class PersonMock {

	/*
	Person person = new Person();
	person.setId(counter.incrementAndGet());
	person.setFirstName("Paulo");
	person.setLastName("Carpinetti");
	person.setAddress("São Paulo, Brasil");
	person.setGender("male");
	return person;
	*/
	
	/*
	 * List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++ ) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
	 */
	
	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Person last name " + i);
		person.setAddress( i + " Brasil");
		person.setGender("male " + i);
		return person;
		
	}	
	
	private final AtomicLong counter = new AtomicLong();
}

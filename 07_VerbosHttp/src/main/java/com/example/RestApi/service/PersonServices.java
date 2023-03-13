package com.example.RestApi.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApi.exception.ResourceNotFoundException;
import com.example.RestApi.model.Person;
import com.example.RestApi.repositories.PersonRepository;

@Service
public class PersonServices {

	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public Person findById(Long id) {
		
		logger.info("finding one person!");
		
		return repository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException(
						"No records found for this Id."));
		
	}
	
	public List<Person> findAll() {
		
		logger.info("finding all persons!");

		return repository.findAll();
	}
	
	public Person create(Person person) {
		logger.info("creating one person!");
		
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("updating one person!");
		 Person entity = repository.findById(person.getId()).
				 orElseThrow(() -> new ResourceNotFoundException(
						"No records found for this Id."));
		 			
			entity.setFirstName(person.getFirstName());
			entity.setLastName(person.getLastName());
			entity.setAddress(person.getAddress());
			entity.setGender(person.getGender());
			
		return repository.save(person);
	}
	
	public void delete(Long id) {
		logger.info("deleting one person!");
		Person entity = repository.findById(id).
				 orElseThrow(() -> new ResourceNotFoundException(
						"No records found for this Id."));		
		repository.delete(entity);
		
	}
		


}

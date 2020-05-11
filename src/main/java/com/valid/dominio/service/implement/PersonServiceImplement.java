package com.valid.dominio.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.valid.dominio.entity.PersonEntity;
import com.valid.dominio.service.PersonService;
import com.valid.dominio.service.repository.PersonServiceRepository;

@Service
public class PersonServiceImplement implements PersonService{
	
	@Autowired
	private PersonServiceRepository personServiceRepository;
	
	

	@Override
	public List<PersonEntity> listAllPerson() {
		return personServiceRepository.findAll();
	}



	@Override
	public PersonEntity savePerson(PersonEntity person) {
		person.setProcess(true);
		return personServiceRepository.save(person);
	}

	@Override
	public PersonEntity updatePerson(PersonEntity personEntity) {
		personEntity.setProcess(true);
		return personServiceRepository.save(personEntity);
	}



	@Override
	public Optional<PersonEntity> findByNameAndLastName(String name, String lastname) {
		return personServiceRepository.findByNameAndLastName(name,lastname);
	}

}

package com.valid.dominio.service;

import java.util.List;
import java.util.Optional;

import com.valid.dominio.entity.PersonEntity;

public interface PersonService{
	public List<PersonEntity> listAllPerson();

	public PersonEntity savePerson(PersonEntity personEntity);

	public Optional<PersonEntity> findByNameAndLastName(String name, String lastname);


	public PersonEntity updatePerson(PersonEntity personEntity);
}

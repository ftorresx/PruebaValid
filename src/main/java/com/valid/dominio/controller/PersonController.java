package com.valid.dominio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid.dominio.dto.PersonDTO;
import com.valid.dominio.entity.PersonEntity;
import com.valid.dominio.service.PersonService;

@RestController
@RequestMapping("/person")
@CrossOrigin("*")
public class PersonController {

	@Autowired
	PersonService personService; 

	@Autowired
	private ModelMapper modelMapper;


	@GetMapping(value = "/find-all-person")
	public List<PersonDTO> listPerson(){
		List<PersonEntity> list = personService.listAllPerson();
		return list.stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());

	}

	private PersonDTO convertToDto(PersonEntity post) {
		PersonDTO personDTO = modelMapper.map(post, PersonDTO.class);
		return personDTO;
	}


	private PersonEntity convertToEntity(PersonDTO personDTO)  {
		PersonEntity personEntity = modelMapper.map(personDTO, PersonEntity.class);
		return personEntity;
	}

	@PostMapping(value = "/save-person")
	public List<PersonDTO> createClient(@RequestBody List<PersonDTO> personDTO) {
		
		List<PersonDTO> listPersonResponse = new ArrayList<PersonDTO>();
		
		for(PersonDTO person : personDTO ) {
			Optional<PersonEntity> responsePerson = personService.findByNameAndLastName(person.getName(), person.getLastName());
			
			
			if(responsePerson.isEmpty()) {
				PersonEntity resPerson = convertToEntity(person);	
				listPersonResponse.add(convertToDto(personService.savePerson(resPerson)));
			}	
		}
		return listPersonResponse;

	}

	@PutMapping(value="/update-person")
	public PersonDTO updateClient(@RequestBody PersonDTO personDTO) {
		PersonEntity post = convertToEntity(personDTO);
		return convertToDto(personService.savePerson(post));

	}



}

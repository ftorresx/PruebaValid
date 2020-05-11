package com.valid.dominio.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valid.dominio.entity.PersonEntity;

@Repository
public interface PersonServiceRepository extends JpaRepository<PersonEntity, Long> {
	
	public Optional<PersonEntity> findByNameAndLastName(String name,  String lastname);
}

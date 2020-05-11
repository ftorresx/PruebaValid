package com.valid.dominio.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable{
	
	private static final long serialVersionUID = 1234L;
	
	private Long id;	
	private String name;
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private Boolean process;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getProcess() {
		return process;
	}
	public void setProcess(Boolean process) {
		this.process = process;
	}

}

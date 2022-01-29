package com.aelion.microservices.gateway.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aelion.microservices.gateway.dto.PersonDto;
import com.aelion.microservices.gateway.proxies.PersonServiceProxy;

@Service
public class PersonService {
	@Autowired
	PersonServiceProxy proxy;
	
	public List<PersonDto> findAll() {
		return proxy.retrievePersons();
	}
	
	public Optional<PersonDto> findOne(Long id) {
		return proxy.retrievePerson(id);
	}
}

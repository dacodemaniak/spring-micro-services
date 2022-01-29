package com.aelion.microservices.gateway.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aelion.microservices.gateway.dto.PersonDto;
import com.aelion.microservices.gateway.services.PersonService;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
	@Autowired
	private PersonService service;
	
	@GetMapping
	public List<PersonDto> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<PersonDto> findOne(Long id) {
		return service.findOne(id);
	}
}

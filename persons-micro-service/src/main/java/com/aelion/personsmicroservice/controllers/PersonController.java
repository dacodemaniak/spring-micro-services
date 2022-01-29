package com.aelion.personsmicroservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aelion.personsmicroservice.dto.FullPersonDto;
import com.aelion.personsmicroservice.services.PersonServiceImpl;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	@Autowired
	PersonServiceImpl service;
	
	@GetMapping
	public List<FullPersonDto> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<FullPersonDto> findOne(@PathVariable Long id) {
		return service.findOne(id);
	}
	
}

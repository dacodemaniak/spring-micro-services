package com.aelion.addressms.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.aelion.addressms.models.Address;
import com.aelion.addressms.repositories.AddressRepository;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	@Autowired
	private AddressRepository repository;
	
	@GetMapping
	public List<Address> all() {
		return this.repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Address one(@PathVariable String id) throws Exception {
		return this.repository.findById(id)
				.orElseThrow(() -> new Exception("No address with the given ID : " + id));
	}
	
	@PostMapping
	public ResponseEntity add(@RequestBody Address address) {
		Address savedAddress = this.repository.insert(address);
		
		// Let's build an URI with the brand new Address ID
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedAddress.getId())
				.toUri();
		
		// Return the full response
		return ResponseEntity.created(uri).build();
	}
}

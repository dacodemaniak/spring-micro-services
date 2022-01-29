package com.aelion.microservices.gateway.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aelion.microservices.gateway.dto.PersonDto;

@FeignClient(name="person-service")
public interface PersonServiceProxy {
	@GetMapping("/api/person")
	public List<PersonDto> retrievePersons();
	
	@GetMapping("/api/person/{id}")
	public Optional<PersonDto> retrievePerson(@PathVariable Long id);
}

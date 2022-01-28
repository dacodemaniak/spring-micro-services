package com.aelion.personsmicroservice.services;

import java.util.List;
import java.util.Optional;

import com.aelion.personsmicroservice.dto.FullPersonDto;
import com.aelion.personsmicroservice.models.PersonModel;

public interface PersonService {
	public Optional<FullPersonDto> findOne(Long id);
	public List<FullPersonDto> findAll();
	
}

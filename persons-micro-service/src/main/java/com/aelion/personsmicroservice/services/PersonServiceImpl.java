package com.aelion.personsmicroservice.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aelion.personsmicroservice.dto.AddressDto;
import com.aelion.personsmicroservice.dto.FullPersonDto;
import com.aelion.personsmicroservice.models.PersonModel;
import com.aelion.personsmicroservice.proxies.AddressServiceProxy;
import com.aelion.personsmicroservice.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository repository;
	
	@Autowired
	AddressServiceProxy proxy;
	
	@Override
	public Optional<FullPersonDto> findOne(Long id) {
		// TODO Auto-generated method stub
		Optional<PersonModel> oPerson = repository.findById(id);
		
		if (oPerson.isPresent()) {
			AddressDto response = proxy.retrieveAdress(oPerson.get().getAddressId());
			
			FullPersonDto person = new FullPersonDto();
			person.setLastName(oPerson.get().getLastName());
			person.setFirstName(oPerson.get().getFirstName());
			person.setAddress(response);
			
			return Optional.of(person);
		}
		
		return Optional.empty();
	}

	@Override
	public List<FullPersonDto> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(repository.findAll().spliterator(), false)
		.map(person -> {
				AddressDto response = proxy.retrieveAdress(person.getAddressId());
				
				FullPersonDto fullPerson = new FullPersonDto();
				fullPerson.setLastName(person.getLastName());
				fullPerson.setFirstName(person.getFirstName());
				fullPerson.setAddress(response);
				
				return fullPerson;
			}
		)
		.collect(Collectors.toList());
	}

}

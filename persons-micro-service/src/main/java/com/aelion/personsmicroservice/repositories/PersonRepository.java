package com.aelion.personsmicroservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aelion.personsmicroservice.models.PersonModel;

public interface PersonRepository extends CrudRepository<PersonModel, Long> {

}

package com.aelion.addressms.repositories;

import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aelion.addressms.models.Address;

public interface AddressRepository extends MongoRepository<Address, String> {}

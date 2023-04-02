package com.Sajid.SMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Sajid.SMS.model.Address;

public interface AddressRepository extends MongoRepository<Address, Integer>{

}

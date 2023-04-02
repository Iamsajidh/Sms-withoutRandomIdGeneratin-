package com.Sajid.SMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sajid.SMS.model.Address;
import com.Sajid.SMS.repository.AddressRepository;

@Service
public class AddressService {

	
	@Autowired
	AddressRepository addressRespo;
	
	public Address createAddress( Address address)
	{
		return addressRespo.save(address);
	}
	
	public List <Address> getAddress()
	{
		return addressRespo.findAll();
	}
	
	public void deleteAddress(int id)
	{
		addressRespo.deleteById(id);
	}
	
	public Address updateAddress(int id, Address addressDetails )
	{
		Address address = addressRespo.findById(id).get();
		address.setId(addressDetails.getId());
		address.setCity(addressDetails.getCity());
		address.setState(addressDetails.getState());
		return addressRespo.save(address);
}
}

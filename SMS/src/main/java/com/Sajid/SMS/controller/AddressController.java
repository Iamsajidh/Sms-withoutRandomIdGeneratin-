package com.Sajid.SMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Sajid.SMS.model.Address;
import com.Sajid.SMS.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	public AddressService addressService;
	
	@RequestMapping(value = "/address", method=RequestMethod.POST)
	public Address createAddress( Address address)
	{
		return addressService.createAddress(address);
	}
	
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public List <Address> getAddress()
	{
		return addressService.getAddress();
	}
	
	@RequestMapping(value = "/address/{$id}", method = RequestMethod.PUT)
	public Address readAddress(@PathVariable (value="/id") int id, @RequestBody Address addressDetails)
	{
		return addressService.updateAddress(id, addressDetails);
	}
	
	
	@RequestMapping(value = "/address/{$id}", method = RequestMethod.DELETE)
	public void deleteAddress( @PathVariable (value="/id") int id)
	{
		addressService.deleteAddress(id);
	}

}

package com.cubic.main;

import com.cubic.entities.AddressEntity;
import com.cubic.entities.EmployeeEntity;
import com.cubic.repositories.AddressRepository;
import com.cubic.repositories.EmployeeRepository;

public class OneToOneMainExample {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		AddressEntity address= new AddressEntity();
		AddressRepository addressRepository = new AddressRepository();
		address.setAddress_line1("3300 Woodburn Village Dr");
		address.setAddress_line2("Apt 22");
		address.setState("Virginia");
		address.setCity("Annandale");
		address.setZipcode(22003);
		address.setCountry("USA");
		
		EmployeeEntity addAddress =employeeRepository.getEmployeeEntityByName("Deepak");
		address.setEmployee(addAddress);
		//addressRepository.save(address);
		
		//select
		AddressEntity address1=addressRepository.getAddressEntityById(1);
		//System.out.println(address1.toString());
		
	}

}

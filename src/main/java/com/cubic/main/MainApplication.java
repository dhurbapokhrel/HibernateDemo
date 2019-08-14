package com.cubic.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.cubic.entities.EmployeeEntity;
import com.cubic.repositories.EmployeeRepository;

public class MainApplication {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setFirst_name("Rajesh");
		employeeEntity.setLast_name("sharma");
		employeeEntity.setDate_of_birth("1993-02-29");
		employeeRepository.save(employeeEntity);
		
		
		
		
		employeeEntity.setFirst_name("Mohan");
		employeeEntity.setLast_name("Kumar");
		employeeEntity.setDate_of_birth("1990-08-20");
		//employeeRepository.update(employeeEntity);
		
		EmployeeEntity emp = employeeRepository.getEmployeeEntityById(4);
		//System.out.println(emp.toString());

		
		
		EmployeeEntity emp1=employeeRepository.getEmployeeEntityByName("Rajesh");
		//System.out.println(emp1.toString());
		
		
		List<EmployeeEntity> employees =(List<EmployeeEntity>) employeeRepository.getEmployeeEntityByName("Rajesh");
		
		System.out.println("*************************");
		for(int i =0;i>employees.size();i++) {
			
			//System.out.println(i);
		}
		//for(EmployeeEntity e:employees) {

			//System.out.println(e.toString());
		//}
	}
	
	
}

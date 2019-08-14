package com.cubic.main;


import java.util.ArrayList;
import java.util.List;

import com.cubic.entities.EmployeeEntity;
import com.cubic.entities.SalaryEntity;
import com.cubic.repositories.EmployeeRepository;
import com.cubic.repositories.SalaryRepository;

public class OneToManyJoinTableMainExample {

	public static void main(String[] args) {
		
		//Insert
		EmployeeRepository employeeRepository = new EmployeeRepository();
		SalaryRepository salaryRepository = new SalaryRepository();
		
		SalaryEntity salary = new SalaryEntity();
		salary.setSalary(50000l);
		salary.setPosition("developer");
		salary.setStarted_at("07/08/2019");
		
		EmployeeEntity employee1=employeeRepository.getEmployeeEntityById(1);
		EmployeeEntity employee2=employeeRepository.getEmployeeEntityById(2);

		List<EmployeeEntity> employies =new ArrayList<EmployeeEntity>();
		
		employies.add(employee1);
		employies.add(employee2);
		salary.setEmployee(employies);
		salaryRepository.save(salary);
	}

}

package com.rajiv.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajiv.demo.model.Employee;
import com.rajiv.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;

	public Optional<Employee> getEmployee(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id);
	}

	public List<Employee> getEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return empRepo.findByCity(city);
	}

	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return empRepo.findByName(name);
	}

	public List<Employee> getEmployeeSalGreaterThan(int sal) {
		// TODO Auto-generated method stub
		return empRepo.findBySalGreaterThan(sal);
		//return null;
	}

	public List<Employee> getEmployeeByCountry(String country) {
		// TODO Auto-generated method stub
		return empRepo.findByCountry(country);
	}
	
}

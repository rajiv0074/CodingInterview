package com.rajiv.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajiv.demo.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByCity(String city);

	List<Employee> findByName(String name);
	
	List<Employee> findByCountry(String Country);
	List<Employee> findBySalGreaterThan(int Sal);
	
}

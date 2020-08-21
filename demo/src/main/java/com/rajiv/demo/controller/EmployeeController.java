package com.rajiv.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajiv.demo.model.Employee;
import com.rajiv.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// Get by Id
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployee(id);

	}

	// Get by City
	@GetMapping("/city/{city}")
	private List<Employee> getEmployeeByCity(@PathVariable String city) {
		return employeeService.getEmployeeByCity(city);

	}

	// Get by Name
	@GetMapping("/name/{name}")
	private List<Employee> getEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);

	}

	// Get Employee Sal greater than given value
	@GetMapping("/salaryGreaterThan/{sal}")
	private List<Employee> getEmployeeSalGreaterThan(@PathVariable int sal) {
		return employeeService.getEmployeeSalGreaterThan(sal);

	}

	// Get by country
	@GetMapping("/country/{country}")
	private List<Employee> getEmployeeByCountry(@PathVariable String country) {
		return employeeService.getEmployeeByCountry(country);

	}

}

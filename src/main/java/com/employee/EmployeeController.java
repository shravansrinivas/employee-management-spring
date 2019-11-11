package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class EmployeeController {
	@Autowired
	private appDAL employees;

	@GetMapping("/employees")
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		return employees.viewEmployees();
	}

	@DeleteMapping(path = { "/employees/{id}" })
	public Employee delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Employee deletedEmp = employees.findById(id);
		System.out.println(deletedEmp);
		if(employees.delete(deletedEmp))
			return deletedEmp;
		else
			return null;
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		return employees.createEmployee(e);
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable String id, @RequestBody Employee e) {
		return employees.updateEmployee(id, e);
	}
@GetMapping("/employees/{id}")
public Employee getEmployee(@PathVariable String id) {
	
	return employees.findById(id);
}

}

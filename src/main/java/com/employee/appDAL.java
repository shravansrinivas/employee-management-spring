package com.employee;

import java.util.List;

public interface appDAL {
	public Employee createEmployee(Employee e);



	public List<Employee> viewEmployees();

	Employee findById(String id);
	
	public Employee updateEmployee(String empID, Employee e);
	public Boolean delete(Employee emp);
}

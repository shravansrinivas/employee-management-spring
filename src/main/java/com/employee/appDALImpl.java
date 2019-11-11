package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class appDALImpl implements appDAL {
	@Autowired
	private MongoTemplate employees;

	public appDALImpl() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Employee createEmployee(Employee e) {
		return employees.save(e);

	}

	@Override
	public Employee updateEmployee(String empID, Employee e) {
		return employees.findAndReplace(new Query(Criteria.where("_id").is(empID)), e);
		
	}

	@Override
	public List<Employee> viewEmployees() {
		
		return employees.findAll(Employee.class);
	}

	@Override
	public Employee findById(String id) {
		// TODO Auto-generated method stub
		//return employees.findAndRemove(new Query(Criteria.where("id").is(id)), Employee.class);
	return employees.findById(id, Employee.class);
	}
	@Override
	public Boolean delete(Employee emp) {
		// TODO Auto-generated method stub
		return employees.remove(emp).wasAcknowledged();
	}


	




}

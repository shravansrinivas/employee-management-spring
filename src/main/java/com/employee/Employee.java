package com.employee;


import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Employee_List")
public class Employee {
@Id
private String employeeID;
private String employeeName,employeeEmail,employeeDesignation;
private Track employeeTrack;
private Batch employeeBatch;
private int[] employeeAssessmentMarks;

	public Employee(String employeeName, String employeeEmail, String employeeDesignation) {
	super();
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeDesignation = employeeDesignation;
}
	public Employee(String employeeID, String employeeName, String employeeEmail, String employeeDesignation,
		Track employeeTrack, Batch employeeBatch, int[] employeeAssessmentMarks) {
	super();
	this.employeeID = employeeID;
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeDesignation = employeeDesignation;
	this.employeeTrack = employeeTrack;
	this.employeeBatch = employeeBatch;
	this.employeeAssessmentMarks = employeeAssessmentMarks;
}
	
	public String getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(String employeeID) {
	this.employeeID = employeeID;
}

public Employee(String employeeID, String employeeName, String employeeEmail, String employeeDesignation,
		Batch employeeBatch) {
	super();
	this.employeeID = employeeID;
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeDesignation = employeeDesignation;
	this.employeeBatch = employeeBatch;
}
public Employee(String employeeID, String employeeName, String employeeEmail, String employeeDesignation) {
	super();
	this.employeeID = employeeID;
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeDesignation = employeeDesignation;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	this.employeeDesignation = employeeDesignation;
}
public Track getEmployeeTrack() {
	return employeeTrack;
}
public void setEmployeeTrack(Track employeeTrack) {
	this.employeeTrack = employeeTrack;
}
public Batch getEmployeeBatch() {
	return employeeBatch;
}
public void setEmployeeBatch(Batch employeeBatch) {
	this.employeeBatch = employeeBatch;
}
public int[] getEmployeeAssessmentMarks() {
	return employeeAssessmentMarks;
}
public void setEmployeeAssessmentMarks(int[] employeeAssessmentMarks) {
	this.employeeAssessmentMarks = employeeAssessmentMarks;
}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeDesignation=" + employeeDesignation + ", employeeTrack=" + employeeTrack
				+ ", employeeBatch=" + employeeBatch + ", employeeAssessmentMarks="
				+ Arrays.toString(employeeAssessmentMarks) + "]";
	}


}

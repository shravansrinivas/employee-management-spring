package com.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Assessment_List")
public class Assessment {
@Id
private String assessmentId;
private Batch batchName;
private Employee employeeeName;
private int assessmentMarks;
	public Assessment() {
		// TODO Auto-generated constructor stub
	}
	public String getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}
	public Batch getBatchName() {
		return batchName;
	}
	public Assessment(String assessmentId) {
		super();
		this.assessmentId = assessmentId;
	}
	public void setBatchName(Batch batchName) {
		this.batchName = batchName;
	}
	public Employee getEmployeeeName() {
		return employeeeName;
	}
	public void setEmployeeeName(Employee employeeeName) {
		this.employeeeName = employeeeName;
	}
	public int getAssessmentMarks() {
		return assessmentMarks;
	}
	public void setAssessmentMarks(int assessmentMarks) {
		this.assessmentMarks = assessmentMarks;
	}
	public Assessment(String assessmentId, Batch batchName, Employee employeeeName, int assessmentMarks) {
		super();
		this.assessmentId = assessmentId;
		this.batchName = batchName;
		this.employeeeName = employeeeName;
		this.assessmentMarks = assessmentMarks;
	}
	public Assessment(String assessmentId, Batch batchName) {
		super();
		this.assessmentId = assessmentId;
		this.batchName = batchName;
	}
	@Override
	public String toString() {
		return "Assessment [assessmentId=" + assessmentId + ", batchName=" + batchName + ", employeeeName="
				+ employeeeName + ", assessmentMarks=" + assessmentMarks + "]";
	}

}

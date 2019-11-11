package com.employee;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Batch_List")
public class Batch {
@Id
private String batchID;
private String batchName;
@DBRef
private List<Employee> candidates;

private String batchTrack;
	public Batch() {
		// TODO Auto-generated constructor stub
	}
	public String getBatchID() {
		return batchID;
	}
	public void setBatchID(String batchID) {
		this.batchID = batchID;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public List<Employee> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Employee> candidates) {
		this.candidates = candidates;
	}
	public String getBatchTrack() {
		return batchTrack;
	}
	public void setBatchTrack(String batchTrack) {
		this.batchTrack = batchTrack;
	}
	public Batch(String batchID, String batchName, List<Employee> candidates, String batchTrack) {
		super();
		this.batchID = batchID;
		this.batchName = batchName;
		this.candidates = candidates;
		this.batchTrack = batchTrack;
	}
	public Batch(String batchID, String batchName, String batchTrack) {
		super();
		this.batchID = batchID;
		this.batchName = batchName;
		this.batchTrack = batchTrack;
	}
	@Override
	public String toString() {
		return "Batch [batchID=" + batchID + ", batchName=" + batchName + ", candidates=" + candidates + ", batchTrack="
				+ batchTrack + "]";
	}
	public Batch(String batchName) {
		super();
		this.batchName = batchName;
	}

}

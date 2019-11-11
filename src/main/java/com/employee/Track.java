package com.employee;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Track_List")

public class Track {
@Id
private String trackID;
private String trackName;
private List<Topic> trackTopics;
	public Track(String trackID, String trackName, List<Topic> trackModules) {
	super();
	this.trackID = trackID;
	this.trackName = trackName;
	this.trackTopics = trackModules;
}
	public String getTrackID() {
	return trackID;
}
public void setTrackID(String trackID) {
	this.trackID = trackID;
}
public String getTrackName() {
	return trackName;
}
public void setTrackName(String trackName) {
	this.trackName = trackName;
}
public List<Topic> getTrackModules() {
	return trackTopics;
}
public void setTrackModules(List<Topic> trackModules) {
	this.trackTopics = trackModules;
}
	public Track() {
		
	}
	public Track(String trackID, String trackName) {
		super();
		this.trackID = trackID;
		this.trackName = trackName;
	}
	

}

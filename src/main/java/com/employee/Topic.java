package com.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Topic_List")
public class Topic {
@Id
private String topicID;
private String topicName,topicDesc;
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	public String getTopicID() {
		return topicID;
	}
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	public Topic(String topicID, String topicName, String topicDesc) {
		super();
		this.topicID = topicID;
		this.topicName = topicName;
		this.topicDesc = topicDesc;
	}
	@Override
	public String toString() {
		return "Topic [topicID=" + topicID + ", topicName=" + topicName + ", topicDesc=" + topicDesc + "]";
	}

}

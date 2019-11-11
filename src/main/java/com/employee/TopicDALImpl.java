package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TopicDALImpl implements TopicDAL {
@Autowired 
private MongoTemplate topics;

@Override
public List<Topic> viewTopics() {
	
	return topics.findAll(Topic.class);
}

@Override
public Topic createTopic(Topic t) {
	
	return topics.save(t);
}

}

package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TopicController {
@Autowired
private TopicDAL topics;

@GetMapping("/topics")
public List<Topic> viewTopics(){
	return topics.viewTopics();
}

@PostMapping("/topics")
public Topic createTopic(@RequestBody Topic t) {
	return topics.createTopic(t);
}
}

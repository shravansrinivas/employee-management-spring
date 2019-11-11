package com.employee;

import java.util.List;

public interface TopicDAL {
public List<Topic> viewTopics();
public Topic createTopic(Topic t);
}

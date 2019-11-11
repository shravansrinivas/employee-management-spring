package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AssessmentDALImpl implements AssessmentDAL {
@Autowired 
private MongoTemplate assessments;
	@Override
	public List<Assessment> getAssessments() {
		
		return assessments.findAll(Assessment.class);
	}

	@Override
	public Assessment createAssessment(Assessment a) {
		// TODO Auto-generated method stub
		return assessments.save(a);
	}

}

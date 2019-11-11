package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AssessmentController {
@Autowired
private AssessmentDAL assessments;

@RequestMapping(value = "/assessments", method = RequestMethod.GET, produces = "application/json")
public List<Assessment> firstPage() {
	return assessments.getAssessments();
}
@PostMapping("/assessments")
public Assessment createAssessment(@RequestBody Assessment a) {
	return assessments.createAssessment(a);
}
}

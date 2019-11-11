package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class BatchController {
	@Autowired
	private BatchDAL batches;
	@PostMapping("/batches")
	public Batch addBatch(@RequestBody Batch e) {
		
		return batches.createBatch(e);
		
	}
	@GetMapping("/batches")
	public List<Batch> viewAllBatches(){
		
		return batches.viewBatch();
	}
}

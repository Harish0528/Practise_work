package com.bitlabs.bischeduler.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.bischeduler.entity.Jobs;
import com.bitlabs.bischeduler.service.JobsServiceInterface;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class JobsController {

	@Autowired
	private JobsServiceInterface jsi;
	
	@PostMapping("/saveJobDetails")
	public boolean saveJob(@Valid @RequestBody Jobs job)
	{
		return jsi.saveJobData(job);
	}
	
	@GetMapping("/viewAllJobDetails")
	public List<Jobs> getAllJobDetails(){
		return jsi.getJobDetails(); 
	}
	
	@GetMapping("/jobDetailById")
	public Jobs getJobById(@RequestBody Jobs job) {
		return jsi.getJobById(job.getId());
	}
	
	@DeleteMapping("/deleteJobDetail")
	 public String deleteJobDetails(@RequestBody Jobs job) {
			
			jsi.deleteJobDetails(job.getId());
			return "Deleted Successfully";
		}
	
	@PutMapping("/updateJobDetail")
	public boolean updateJobDetails(@RequestBody Jobs jobdetail) {
		
		return jsi.updateJobDetail(jobdetail.getId(),jobdetail);
	}
	
	@GetMapping("/getJobDeatailByName")
	public List<Jobs> getJobByName(@RequestBody Jobs job){
		return jsi.getJobByName(job.getJobname());
	}
}

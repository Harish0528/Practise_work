package com.bitlabs.bischeduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.bischeduler.entity.Jobs;
import com.bitlabs.bischeduler.repository.JobsRepositoryInterface;


@Service
public class JobsServiceImpl implements JobsServiceInterface {

	
	@Autowired
	private JobsRepositoryInterface jri;

	@Override
	public boolean saveJobData(Jobs job) {
		// TODO Auto-generated method stub
		Jobs j= job;
		boolean b=false;
		if(j!=null) {
			jri.save(job);
			 b=true;
		}
			return b;
	}

	@Override
	public List<Jobs> getJobDetails() {
		// TODO Auto-generated method stub
		return jri.findAll();
	}

	@Override
	public void deleteJobDetails(int id) {
		// TODO Auto-generated method stub
		jri.deleteById(id);
	}

	@Override
	public boolean updateJobDetail(int id, Jobs jobdetail) {
		// TODO Auto-generated method stub
		Jobs jd=jri.findById(id).get();
		jobdetail.setCreated_at(jd.getCreated_at());
		Jobs j=jobdetail;
		boolean b=false;
		if(j!=null) {
			jri.save(jobdetail);
			 b=true;
		}
			return b;
		
	}

	@Override
	public Jobs getJobById(int id) {
		// TODO Auto-generated method stub
		return jri.findById(id).get();
	}

	@Override
	public List<Jobs> getJobByName(String jname) {
		// TODO Auto-generated method stub
		return jri.getJobsByJobname(jname);
	}
}

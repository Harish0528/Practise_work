package com.bitlabs.bischeduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.bischeduler.entity.Jobs;

@Repository
public interface JobsRepositoryInterface extends JpaRepository<Jobs, Integer>{
	
	public List<Jobs> getJobsByJobname(String jobname);


}

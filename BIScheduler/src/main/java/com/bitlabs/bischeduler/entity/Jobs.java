package com.bitlabs.bischeduler.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Jobs {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Enter JobName")
	private String jobname;
	private String description;
	private int recurrance_id;
	private Date startdate;
	private Date enddate;
	private String starttime;
	private int created_by=1;
	private int duration;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created_at;
	public java.util.Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(java.util.Date created_at) {
		this.created_at = created_at;
	}

	
	
	@PrePersist
	public void oncreate() {
		created_at=new java.util.Date();	
	}

	public int getId() {
		return id;
	}


	public void setId( int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getRecurrance_id() {
		return recurrance_id;
	}


	public void setRecurrance_id(int recurrance_id) {
		this.recurrance_id = recurrance_id;
	}


	public int getCreated_by() {
		return created_by;
	}


	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}



	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public String getStarttime() {
		return starttime;
	}


	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}


}

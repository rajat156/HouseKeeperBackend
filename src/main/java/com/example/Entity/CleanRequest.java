package com.example.Entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class CleanRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
	
	private int rollnumber;
	
	private int worker_id;
	
	private Date date;
	
	private LocalTime cleanTime;
	
	private boolean req_status;

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getWorker_id() {
		return worker_id;
	}

	public void setWorker_id(int worker_id) {
		this.worker_id = worker_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LocalTime getCleanTime() {
		return cleanTime;
	}

	public void setCleanTime(LocalTime cleanTime) {
		this.cleanTime = cleanTime;
	}

	public boolean isReq_status() {
		return req_status;
	}

	public void setReq_status(boolean req_status) {
		this.req_status = req_status;
	}
	
	
}

package com.example.Entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
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

	private Date date;
	
	private LocalTime cleanTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rollnumber")
	private Student student;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="worker_id")
	private Worker worker;
	
	
	private boolean req_status;

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
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

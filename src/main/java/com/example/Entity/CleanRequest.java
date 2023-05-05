package com.example.Entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import org.hibernate.annotations.ManyToAny;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
	private long request_id;

	private Date date;
	
	private LocalTime cleanTime;
	
	private boolean feedback_status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rollnumber")
	//@JsonManagedReference(value="student_request")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="worker_id")
//	@JsonManagedReference(value="workercleanrequest")
	private Worker worker;
	
	
	private boolean req_status;

	
	public boolean isFeedback_status() {
		return feedback_status;
	}

	public void setFeedback_status(boolean feedback_status) {
		this.feedback_status = feedback_status;
	}

	public long getRequest_id() {
		return request_id;
	}

	public void setRequest_id(long request_id) {
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

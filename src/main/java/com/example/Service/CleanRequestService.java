package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CleanRequest;
import com.example.Entity.Student;
import com.example.dao.CleanRequestRepo;

@Service
public class CleanRequestService {

	@Autowired
	private CleanRequestRepo cleanRequestRepo;

	public CleanRequest submitRequest(CleanRequest cleanRequest) {
		
		return this.cleanRequestRepo.saveAndFlush(cleanRequest);
	}

	public List<Integer> getRequestCount(int rollno) {
		
		return this.cleanRequestRepo.requestCount(rollno);
	}

	public List<CleanRequest> getRequestByRollnumber(Student student) {
		return this.cleanRequestRepo.findAllByStudent(student);
		//return this.cleanRequestRepo.findAllByRollnumber(rollno);
	}

	public List<CleanRequest> getAllCleanRequest() {
		// TODO Auto-generated method stub
		return this.cleanRequestRepo.findAll();
	}

	public long getAllCleanRequestCount() {
		// TODO Auto-generated method stub
		return this.cleanRequestRepo.count();
	}

	public CleanRequest getCleanRequestById(int id) {
		// TODO Auto-generated method stub
		 Optional<CleanRequest> findById = this.cleanRequestRepo.findById(id);
		 return findById.get();
	}
}

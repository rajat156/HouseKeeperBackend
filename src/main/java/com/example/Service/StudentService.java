package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.dao.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	
	public Student saveStudent(Student student) {
		return this.studentRepo.saveAndFlush(student);
	}


	public Student getStudent(int rollnumber) {
		
		 
		 return this.studentRepo.findByRollnumber(rollnumber);
	}
}

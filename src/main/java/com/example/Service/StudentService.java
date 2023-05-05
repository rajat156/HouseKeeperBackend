package com.example.Service;

import java.util.List;
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
	
	public Student getStudent(long rollnumber) {	 
		 return this.studentRepo.findByRollnumber(rollnumber);
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return this.studentRepo.findAll();
	}

	public Student checkStudent(Student student) {
		// TODO Auto-generated met1hod stub
		List<Student> findAll = this.studentRepo.findAll();
		
		for(Student stu:findAll) {
			if(student.getRollnumber()==stu.getRollnumber() && student.getPassword().equals(stu.getPassword())) {
				return stu;
			}
		}
		return null;
	}

	public List<Student> getAllStudentByHostel(String hostel) {
		// TODO Auto-generated method stub
		return this.studentRepo.findAllByHostel(hostel);
	}
}

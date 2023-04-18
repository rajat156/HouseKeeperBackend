package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		student.setHostel("M");
		return this.studentService.saveStudent(student);
	}
	
	@GetMapping("/getStudent/{rollno}")
	public Student getStudent(@PathVariable("rollno") int rollnumber) {
		return this.studentService.getStudent(rollnumber);
		
	}
}

package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.CleanRequest;
import com.example.Entity.Student;
import com.example.Service.CleanRequestService;
import com.example.Service.StudentService;

@RestController
@CrossOrigin("*")
public class CleanRequestController {

	@Autowired
	private CleanRequestService cleanRequestService;
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/submitRequest/{rollno}")
	public CleanRequest submitRequest(@PathVariable("rollno") int rollno,@RequestBody CleanRequest cleanRequest) {
		
		cleanRequest.setRollnumber(rollno);
		
		return this.cleanRequestService.submitRequest(cleanRequest);
	}
	
	@GetMapping("/requestCount/{rollno}")
	public List<Integer> getRequestCount(@PathVariable("rollno") int rollno){
		return this.cleanRequestService.getRequestCount(rollno);
	}
	
	@GetMapping("/getCleanRequestByRollnumber/{rollno}")
	public List<CleanRequest> getCleanRequestByRollnumber(@PathVariable("rollno") int rollno){
		return this.cleanRequestService.getRequestByRollnumber(rollno);
	}
	
	@GetMapping("/getAllCleanRequest")
	public List<CleanRequest> getAllCleanRequest(){
	return this.cleanRequestService.getAllCleanRequest();
	}
}

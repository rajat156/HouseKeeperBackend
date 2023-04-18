package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CleanRequestService;

@RestController
@CrossOrigin("*")
public class StudentDashboardController {


	@Autowired
	private CleanRequestService  cleanRequestService;
	
}

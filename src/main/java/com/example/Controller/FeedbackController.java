package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Feedback;
import com.example.Service.FeedbackService;

@RestController
@CrossOrigin("*")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/submitFeedback")
	public Feedback submiFeedback(@RequestBody Feedback feedback) {
		return this.feedbackService.submitFeedback(feedback) ;
	}
}

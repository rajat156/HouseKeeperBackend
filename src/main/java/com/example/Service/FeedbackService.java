package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Feedback;
import com.example.dao.FeedbackRepo;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepo feedbackRepo;

	public Feedback submitFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return this.feedbackRepo.saveAndFlush(feedback);
	}
	
	
}

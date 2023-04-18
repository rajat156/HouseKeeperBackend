package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}

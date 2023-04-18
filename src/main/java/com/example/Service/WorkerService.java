package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.WorkerRepo;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepo workerRepo;
}

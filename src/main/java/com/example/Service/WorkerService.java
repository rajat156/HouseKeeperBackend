package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Worker;
import com.example.dao.WorkerRepo;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepo workerRepo;

	public Worker registerWorker(Worker worker) {
		// TODO Auto-generated method stub
		return this.workerRepo.saveAndFlush(worker);
	}

	public List<Worker> getWorkerByFloor(int floor) {
		// TODO Auto-generated method stub
		return this.workerRepo.findByFloor(floor);
	}
}

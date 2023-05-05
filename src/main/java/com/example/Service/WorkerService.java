package com.example.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

	public List<Worker> getWorkerByFloor(int floor,String hostel) {
		// TODO Auto-generated method stub
		 List<Worker> findByFloor = this.workerRepo.findByFloor(floor);
		return findByFloor.stream().filter(item -> item.getHostel().equals(hostel)).collect(Collectors.toList());
	}

	public Worker getWorkerById(int workerId) {
		// TODO Auto-generated method stub
		 Optional<Worker> findById = this.workerRepo.findById(workerId);
		 return findById.get();
	}
}

package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Worker;

@Repository
public interface WorkerRepo extends JpaRepository<Worker, Integer>{

	public	List<Worker> findByFloor(int floor);

}

package com.workout.controller;

import java.util.List;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workout.entity.WorkoutActive;
import com.workout.repo.WorkoutActiveRepo;
/*tesint*/
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WorkoutActiveController {

	@Autowired
	private WorkoutActiveRepo workoutActiveRepo;

	@GetMapping("/getWorkoutActive")
	public List<WorkoutActive> getWorkoutActive() {
		return (List<WorkoutActive>) workoutActiveRepo.findAll();
	}

	@PostMapping("/saveWorkoutActive")
	void addUser(@RequestBody WorkoutActive user) {
		workoutActiveRepo.save(user);
	}

}

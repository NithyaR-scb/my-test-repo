package com.workout.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.workout.entity.WorkoutActive;
@Repository
public interface WorkoutActiveRepo extends CrudRepository<WorkoutActive, Long>{

}

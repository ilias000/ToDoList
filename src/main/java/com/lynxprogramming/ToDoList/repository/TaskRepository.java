package com.lynxprogramming.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lynxprogramming.ToDoList.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

}

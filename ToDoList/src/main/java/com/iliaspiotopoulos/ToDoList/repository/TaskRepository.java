package com.iliaspiotopoulos.ToDoList.repository;

import java.util.List;
import java.util.UUID;

import com.iliaspiotopoulos.ToDoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID>
{
    List<Task> findAllByOrderByPriority();
}

package com.lynxprogramming.ToDoList.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lynxprogramming.ToDoList.model.Task;
import com.lynxprogramming.ToDoList.repository.TaskRepository;

@Controller
public class MainController {

	@Autowired
	private TaskRepository taskRepository;
	
	@RequestMapping("/")
	public String getTasks(Model model) {
		
		/*
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(1, 2, "Pay bills", LocalDate.of(2021, 01, 20)));
		tasks.add(new Task(2, 3, "Call John", LocalDate.of(2021, 01, 21)));
		tasks.add(new Task(3, 1, "Develop new feature in my app", LocalDate.of(2021, 01, 17)));
		tasks.add(new Task(4, 2, "Prepare for presentation", LocalDate.of(2021, 01, 18)));
		*/
		
		List<Task> tasks = taskRepository.findAll();
		
		model.addAttribute("tasks", tasks);
		
		return "index";
	}
	
}

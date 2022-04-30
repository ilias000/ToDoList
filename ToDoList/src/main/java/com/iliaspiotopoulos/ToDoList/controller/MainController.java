package com.iliaspiotopoulos.ToDoList.controller;

import java.util.List;

import com.iliaspiotopoulos.ToDoList.model.Task;
import com.iliaspiotopoulos.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("/")
    public String getTasks(Model model)
    {
        List<Task> tasks = taskRepository.findAll();

        model.addAttribute("tasks", tasks); // In order to pass the list to the vew page (src/main/resources/templates/index.ftlh).

        return "index"; // In order to return the vew page (src/main/resources/templates/index.ftlh) you have to return only the file name.
    }
}
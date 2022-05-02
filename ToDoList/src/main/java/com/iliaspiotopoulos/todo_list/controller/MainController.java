package com.iliaspiotopoulos.todo_list.controller;

import java.util.List;
import java.util.UUID;

import com.iliaspiotopoulos.todo_list.model.Task;
import com.iliaspiotopoulos.todo_list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("/getTasksOrderByPriority")
    public String getTasksOrderByPriority(Model model)
    {
        List<Task> tasks = taskRepository.findAllByOrderByPriority();
        model.addAttribute("tasks", tasks); // In order to pass the list to the vew page (src/main/resources/templates/index.ftlh).
        return "index"; // In order to return the vew page (src/main/resources/templates/index.ftlh) you have to return only the file name.
    }

    @RequestMapping("/done/{id}")
    public String closeTask(@PathVariable UUID id)
    {
        taskRepository.deleteById(id); // Deleting the Task with the specific id.
        return "redirect:/"; // Redirecting to the home page.
    }

    @RequestMapping("/newTaskForm")
    public String getTaskForm()
    {
        return "task-form"; // Redirecting you to the page with the form to create a new task.
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute Task task)
    {
        taskRepository.save(task); // Adding the task.
        return "redirect:/"; // Redirecting to the home page.
    }
}
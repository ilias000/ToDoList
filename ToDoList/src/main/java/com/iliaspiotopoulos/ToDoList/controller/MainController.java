package com.iliaspiotopoulos.ToDoList.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.iliaspiotopoulos.ToDoList.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @RequestMapping("/")
    public String getTasks(Model model)
    {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(UUID.randomUUID(), 1, "Pay bills", LocalDate.of(2022, 1, 20)));
        tasks.add(new Task(UUID.randomUUID(), 2, "Call John", LocalDate.of(2022, 1, 21)));
        tasks.add(new Task(UUID.randomUUID(), 3, "Develop new feature in my app", LocalDate.of(2022, 1, 21)));
        tasks.add(new Task(UUID.randomUUID(), 3, "Prepare for presentation", LocalDate.of(2022, 1, 15)));

        model.addAttribute("tasks", tasks); // In order to pass the list to the vew page (src/main/resources/templates/index.ftlh).

        return "index"; // In order to return the vew page (src/main/resources/templates/index.ftlh) you have to return only the file name.
    }
}
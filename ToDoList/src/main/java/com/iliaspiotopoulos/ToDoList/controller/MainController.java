package com.iliaspiotopoulos.ToDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @RequestMapping("/")
    public String getTasks()
    {
        return "index"; // In order to return the vew page (src/main/resources/templates/index.ftlh) you have to return only the file name.
    }
}
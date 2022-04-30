package com.iliaspiotopoulos.ToDoList.model;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class Task
{
    private UUID id;

    private Integer priority;

    private String description;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    public Task() {}

    public Task(UUID id, Integer priority, String description, LocalDate date)
    {
        this.id = id;
        this.priority = priority;
        this.description = description;
        this.date = date;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public void setPriority(Integer priority)
    {
        this.priority = priority;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public UUID getId()
    {
        return id;
    }

    public Integer getPriority()
    {
        return priority;
    }

    public String getDescription()
    {
        return description;
    }

    public LocalDate getDate()
    {
        return date;
    }
}

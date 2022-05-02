package com.iliaspiotopoulos.todo_list.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Integer priority;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
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

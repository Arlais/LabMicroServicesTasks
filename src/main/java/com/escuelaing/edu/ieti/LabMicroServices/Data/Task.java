package com.escuelaing.edu.ieti.LabMicroServices.Data;

import com.escuelaing.edu.ieti.LabMicroServices.dto.TaskDto;
import com.escuelaing.edu.ieti.LabMicroServices.dto.TaskStatus;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {

    private static final AtomicInteger count= new AtomicInteger(1);
    private int id;
    private String name;
    private String description;
    private TaskStatus status;
    private String assignedTo;
    private Date dueDate;
    private String created;

    public Task(TaskDto taskDto){
        this.id=count.getAndIncrement();
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.assignedTo = taskDto.getAssignedTo();
        this.dueDate = taskDto.getDueDate();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getCreated() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}

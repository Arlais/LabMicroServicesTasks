package com.escuelaing.edu.ieti.LabMicroServices.dto;

import java.util.Date;

public class TaskDto {

    private String name;
    private String description;
    private TaskStatus status;
    private String assignedTo;
    private Date dueDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

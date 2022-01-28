package com.escuelaing.edu.ieti.LabMicroServices.Services;

import com.escuelaing.edu.ieti.LabMicroServices.Data.Task;

import java.util.List;

public interface TaskService {

    Task create( Task task );

    Task findById(int id );

    List<Task> getAll();

    boolean deleteById( int id );

    Task update( Task task, int id );

}

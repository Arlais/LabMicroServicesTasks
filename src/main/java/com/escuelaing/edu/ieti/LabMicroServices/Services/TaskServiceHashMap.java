package com.escuelaing.edu.ieti.LabMicroServices.Services;

import com.escuelaing.edu.ieti.LabMicroServices.Data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap<Integer, Task> Tasks = new HashMap();


    @Override
    public Task create(Task task) {
        Tasks.put(task.getId(),task);
        return task;
    }

    @Override
    public Task findById(int id) {
        return Tasks.get(id);
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList(Tasks.values());
    }

    @Override
    public boolean deleteById(int id){
        if (Tasks.containsKey(id)){
            Tasks.remove(id);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Task update(Task task, int id) {
        task.setId(id);
        Tasks.put(id, task);
        return Tasks.get(id);
    }
}

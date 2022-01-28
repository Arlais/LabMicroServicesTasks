package com.escuelaing.edu.ieti.LabMicroServices.Controller;

import com.escuelaing.edu.ieti.LabMicroServices.Data.Task;
import com.escuelaing.edu.ieti.LabMicroServices.Services.TaskService;
import com.escuelaing.edu.ieti.LabMicroServices.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "v1/task" )
public class TaskController {

    private final TaskService TaskService;

    public TaskController(@Autowired TaskService userService) {
        this.TaskService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        return new ResponseEntity(TaskService.getAll(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById(@PathVariable int id ) {
        return new ResponseEntity(TaskService.findById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto ) {
        return new ResponseEntity(TaskService.create(new Task(taskDto)), HttpStatus.OK);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable int id ) {
        return new ResponseEntity(TaskService.update(new Task(taskDto),id), HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable int id ) {
        boolean deleted= TaskService.deleteById(id);
        if (deleted){
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}

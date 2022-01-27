package com.escuelaing.edu.ieti.LabMicroServices.Controller;

import com.escuelaing.edu.ieti.LabMicroServices.Data.User;
import com.escuelaing.edu.ieti.LabMicroServices.Services.UserService;
import com.escuelaing.edu.ieti.LabMicroServices.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "v1/user" )
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable int id ) {
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto ) {
        return new ResponseEntity(userService.create(new User(userDto)), HttpStatus.OK);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable int id ) {
        return new ResponseEntity(userService.update(new User(userDto),id), HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable int id ) {
        try{
            userService.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}

package com.escuelaing.edu.ieti.LabMicroServices.Data;

import com.escuelaing.edu.ieti.LabMicroServices.dto.UserDto;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class User {

    private static final AtomicInteger count= new AtomicInteger(0);
    private int id;
    private String name;
    private String email;
    private String lastName;
    private Date createdAt;

    public  User(UserDto userDto){
        id=count.getAndIncrement();
        this.name=userDto.getName();
        this.email=userDto.getEmail();
        this.lastName=userDto.getLastName();
        createdAt=new Date();
    }

}

package com.escuelaing.edu.ieti.LabMicroServices.Services;

import com.escuelaing.edu.ieti.LabMicroServices.Data.User;

import java.util.List;

public interface UserService {

    User create(User user );

    User findById( int id );

    List<User> getAll();

    void deleteById( int id );

    User update( User user, int userId );

}
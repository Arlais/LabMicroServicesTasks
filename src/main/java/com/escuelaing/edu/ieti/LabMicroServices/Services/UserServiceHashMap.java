package com.escuelaing.edu.ieti.LabMicroServices.Services;

import com.escuelaing.edu.ieti.LabMicroServices.Data.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {

    private HashMap<Integer,User> Users;

    @Override
    public User create(User user) {
        Users.put(Users.size()+1,user);
        return user;
    }

    @Override
    public User findById(int id) {
        return Users.get(id);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) Users.values();
    }

    @Override
    public void deleteById(int id) {
        Users.remove(id);
    }

    @Override
    public User update(User user, int userId) {
        Users.put(userId, user);
        return Users.get(userId);
    }
}

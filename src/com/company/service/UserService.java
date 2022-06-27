package com.company.service;

import com.company.Gender;
import com.company.model.User;

import java.util.List;

public interface UserService {

    void addNewUser(List<User> users, int id, String name, int age, Gender gender);

    void findUserById(int id, List<User> users);

    void removeUserById(int id,List<User> users);

    default List<User> getAllUsers(List<User> users){
        return users;
    }

}

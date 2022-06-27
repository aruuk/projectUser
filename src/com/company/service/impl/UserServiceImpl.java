package com.company.service.impl;

import com.company.Gender;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {

    User user = new User();

    @Override
    public void addNewUser(List<User> users , int id, String name, int age, Gender gender) {
        users.add(new User(id, name, age, gender));
        users.forEach(System.out::println);
    }


    @Override
    public void findUserById(int id, List<User> users) {
        //как вывести ошибку, помогите пожалуйста
//        try{
//            if ( id == this.user.getId()){
                users.stream().filter(x -> x.getId() == id).forEach(System.out::println);
//            }else {
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e){
//            System.err.println(e.getMessage());
//        }
    }

    @Override
    public void removeUserById(int id, List<User> users) {
        users.removeIf(x -> x.getId() == id);
        users.forEach(System.out::println);
    }

    @Override
    public List<User> getAllUsers(List<User> users) {
        return users;
    }
}

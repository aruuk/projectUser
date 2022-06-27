package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            List<User> userList = new ArrayList<>();
            userList.add(new User(1, "Anna", 19, Gender.FEMALE));
            userList.add(new User(2, "Jake", 28, Gender.MALE));
            userList.add(new User(3, "Lili", 37, Gender.FEMALE));

            UserServiceImpl userService = new UserServiceImpl();

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1 -> System.out.println(userService.getAllUsers(userList));
                case 2 -> userService.addNewUser(userList, 4, "Tom", 46, Gender.MALE);
                case 3 -> userService.findUserById(1, userList);
                case 4 -> userService.removeUserById(2, userList);
                case 5 -> userList.forEach(System.out::println);
                default -> System.err.println("it is wrong");
            }
        }
    }
}

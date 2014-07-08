package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by tr0k on 2014-07-07.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");

        UserService userService = context.getBean(UserService.class);

        List<User> allUsers = userService.getAllUsers();

        System.out.println("Service name: " + userService.getNameOfService());

        for (User user : allUsers) {
            System.out.println(user);
        }
    }
}

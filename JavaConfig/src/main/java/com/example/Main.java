package com.example;

import com.example.config.SpringConfig;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;

/**
 * Created by tr0k on 2014-07-07.
 */
public class Main {

    public static void main(String[] args) {
        PropertySourcesPlaceholderConfigurer configurer =
                new PropertySourcesPlaceholderConfigurer();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean(UserService.class);

        List<User> allUsers = userService.getAllUsers();

        System.out.println("Service name: " + userService.getServiceName());

        for (User user : allUsers) {
            System.out.println(user);
        }
    }
}

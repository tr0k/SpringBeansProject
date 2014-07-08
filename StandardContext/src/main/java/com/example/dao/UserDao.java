package com.example.dao;

import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tr0k on 2014-07-07.
 */
public class UserDao implements IUserDao {

    @Override
    public List<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User();
        user1.setName("Daniel");
        user1.setSurname("Kowalski");

        User user2 = new User();
        user2.setName("Emil");
        user2.setSurname("Piotrowski");

        users.add(user1);
        users.add(user2);

        return users;
    }
}

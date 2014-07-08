package com.example.service;

import com.example.dao.IUserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tr0k on 2014-07-07.
 */

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Value("${serviceName}")
    private String serviceName;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public String getServiceName() {
        return serviceName;
    }
}

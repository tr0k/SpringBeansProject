package com.example.service;

import com.example.dao.IUserDao;
import com.example.model.User;

import java.util.List;

/**
 * Created by tr0k on 2014-07-07.
 */
public class UserService implements IUserService {


    private IUserDao userDao;

    private String nameOfService;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }
}

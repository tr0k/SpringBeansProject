package com.example.config;

import com.example.dao.IUserDao;
import com.example.dao.UserDao;
import com.example.service.IUserService;
import com.example.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tr0k on 2014-07-07.
 */
@Configuration
public class SpringConfig {
    //TODO improvement of spring config class for entire module JavaConfig

    @Bean
    public IUserDao userDao(){
        return new UserDao();
    }

    @Bean
    public IUserService userService(){
        return new UserService();
    }
}

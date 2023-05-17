package com.example.SpringBootWebApp.service.impl;

import com.example.SpringBootWebApp.model.User;
import com.example.SpringBootWebApp.repository.UserRepository;
import com.example.SpringBootWebApp.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractCRUDService<User, Long> implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    CrudRepository<User, Long> getRepository() {
        return userRepository;
    }
}

package com.example.SpringBootWebApp.controller.rest;

import com.example.SpringBootWebApp.model.Task;
import com.example.SpringBootWebApp.model.User;
import com.example.SpringBootWebApp.service.interf.CRUDService;
import com.example.SpringBootWebApp.service.interf.TaskService;
import com.example.SpringBootWebApp.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserRestController.USER_REST_URL)
public class UserRestController extends CRUDRestController<User, Long>{
    public static final String USER_REST_URL = "user";

    @Autowired
    private UserService userService;

    @Override
    CRUDService<User, Long> getService() {
        return userService;
    }
}

package com.example.SpringBootWebApp.service.impl;

import com.example.SpringBootWebApp.model.Task;
import com.example.SpringBootWebApp.repository.TaskRepository;
import com.example.SpringBootWebApp.service.interf.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractCRUDService<Task, Long> implements TaskService  {

    @Autowired
    TaskRepository taskRepository;

    @Override
    CrudRepository<Task, Long> getRepository() {
        return taskRepository;
    }
}

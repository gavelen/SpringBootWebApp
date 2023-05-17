package com.example.SpringBootWebApp.service.impl;

import com.example.SpringBootWebApp.model.Role;
import com.example.SpringBootWebApp.repository.RoleRepository;
import com.example.SpringBootWebApp.service.interf.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractCRUDService<Role, Long> implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    CrudRepository<Role, Long> getRepository() {
        return roleRepository;
    }
}

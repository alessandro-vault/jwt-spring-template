package com.alessandro54.springtemplate.service;

import com.alessandro54.springtemplate.domain.Role;
import com.alessandro54.springtemplate.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

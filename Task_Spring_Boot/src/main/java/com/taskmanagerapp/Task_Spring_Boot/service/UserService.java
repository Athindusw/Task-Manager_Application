package com.taskmanagerapp.Task_Spring_Boot.service;

import com.taskmanagerapp.Task_Spring_Boot.dto.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(Integer id);

    User searchBYId(Integer id);

    List<User> getAll();

    void updateUser(User user);


}

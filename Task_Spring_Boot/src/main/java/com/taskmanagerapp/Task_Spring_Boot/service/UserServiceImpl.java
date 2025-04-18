package com.taskmanagerapp.Task_Spring_Boot.service;

import com.taskmanagerapp.Task_Spring_Boot.dto.User;
import com.taskmanagerapp.Task_Spring_Boot.entity.UserEntity;
import com.taskmanagerapp.Task_Spring_Boot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service


public class UserServiceImpl implements UserService{


    final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    final ModelMapper mapper = new ModelMapper();
    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public User searchBYId(Integer id) {
     return mapper.map(repository.findById(id),User.class);
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> userArrayList = new ArrayList<>();
       repository.findAll().forEach(userEntity -> {
           userArrayList.add(mapper.map(userEntity, User.class));
       });
       return userArrayList;
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.map(user,UserEntity.class));

    }
}

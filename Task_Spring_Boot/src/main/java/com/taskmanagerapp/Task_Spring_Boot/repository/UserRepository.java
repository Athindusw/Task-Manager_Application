package com.taskmanagerapp.Task_Spring_Boot.repository;

import com.taskmanagerapp.Task_Spring_Boot.dto.User;
import com.taskmanagerapp.Task_Spring_Boot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Integer>{
}

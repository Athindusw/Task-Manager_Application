package com.taskmanagerapp.Task_Spring_Boot.Controller;


import com.taskmanagerapp.Task_Spring_Boot.dto.User;
import com.taskmanagerapp.Task_Spring_Boot.service.UserService;
import com.taskmanagerapp.Task_Spring_Boot.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin

public class UserController {


    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @PutMapping("/update-user")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }

    @GetMapping("search-by-id/{id}")
    public User searchUser(@PathVariable Integer id){
       return service.searchBYId(id);
    }

    @GetMapping("/find-all")
    public List<User> getAll(){
        return service.getAll();
    }


}

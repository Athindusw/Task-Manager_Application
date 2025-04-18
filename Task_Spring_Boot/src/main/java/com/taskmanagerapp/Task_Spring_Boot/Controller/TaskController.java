package com.taskmanagerapp.Task_Spring_Boot.Controller;


import com.taskmanagerapp.Task_Spring_Boot.dto.User;
import com.taskmanagerapp.Task_Spring_Boot.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin

public class TaskController {


    private final UserService service;

    public TaskController(UserService service) {
        this.service = service;
    }

    @PostMapping("/add-task")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @PutMapping("/update-task")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping("/delete-task/{id}")
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

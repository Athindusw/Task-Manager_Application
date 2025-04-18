package com.taskmanagerapp.Task_Spring_Boot;

import com.taskmanagerapp.Task_Spring_Boot.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(TaskSpringBootApplication.class, args);
		System.out.println("Hello world");

		new User();
	}

}

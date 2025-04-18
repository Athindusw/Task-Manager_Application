package com.taskmanagerapp.Task_Spring_Boot.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;

}

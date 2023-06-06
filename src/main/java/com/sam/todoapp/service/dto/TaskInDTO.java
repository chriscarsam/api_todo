package com.sam.todoapp.service.dto;

import com.sam.todoapp.persistence.entity.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskInDTO {

    private String title;
    private String description;
    private LocalDateTime eta;

}

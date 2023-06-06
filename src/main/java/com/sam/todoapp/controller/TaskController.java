package com.sam.todoapp.controller;

import com.sam.todoapp.persistence.entity.Task;
import com.sam.todoapp.service.TaskService;
import com.sam.todoapp.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
        return this.taskService.createTask(taskInDTO);
    }
}

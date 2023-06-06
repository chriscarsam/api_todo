package com.sam.todoapp.service;

import com.sam.todoapp.persistence.entity.Task;
import com.sam.todoapp.persistence.repository.TaskRepository;
import com.sam.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(TaskInDTO taskInDTO){
        this.repository.save()
    }
}

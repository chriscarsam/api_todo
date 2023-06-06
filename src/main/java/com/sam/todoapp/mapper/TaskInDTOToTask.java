package com.sam.todoapp.mapper;

import com.sam.todoapp.persistence.entity.Task;
import com.sam.todoapp.persistence.entity.TaskStatus;
import com.sam.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO,Task>{
    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreateDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}

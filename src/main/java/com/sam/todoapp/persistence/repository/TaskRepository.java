package com.sam.todoapp.persistence.repository;

import com.sam.todoapp.persistence.entity.Task;
import com.sam.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);

}

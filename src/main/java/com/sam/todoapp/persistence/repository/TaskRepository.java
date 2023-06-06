package com.sam.todoapp.persistence.repository;

import com.sam.todoapp.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

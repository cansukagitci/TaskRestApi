package com.example.demo.taskDAO;

import com.example.demo.entity.taskentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tasks")

public interface TaskRepository extends JpaRepository<taskentity,Integer> {
}


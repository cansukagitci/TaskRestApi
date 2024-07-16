package com.example.demo.taskDAO;


import com.example.demo.entity.userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")

public interface UserRepository extends JpaRepository<userentity,Integer> {
}
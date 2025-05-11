package com.varver.hom13_1.repository;

import com.varver.hom13_1.model.Task;

import java.util.List;


public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    boolean existsById(Long id);
    void deleteById(Long id);

}

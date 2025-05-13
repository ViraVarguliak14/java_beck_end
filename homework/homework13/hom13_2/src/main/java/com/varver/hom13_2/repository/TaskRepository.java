package com.varver.hom13_2.repository;

import com.varver.hom13_2.model.Task;

import java.util.ArrayList;
import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    void deleteById(Long id);
}


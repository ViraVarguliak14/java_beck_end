package com.varver.hom1.repository;



import com.varver.hom1.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task delete(Long id);
    Task save(Task task);


}

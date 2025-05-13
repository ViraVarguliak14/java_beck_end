package com.varver.lesson14_hom_1.repository;



import com.varver.lesson14_hom_1.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task delete(Long id);
    Task save(Task task);


}

package com.varver.lesson14_hom_1.repository;

import com.varver.lesson14_hom_1.model.Programmer;
import com.varver.lesson14_hom_1.model.Task;


import java.util.List;


public interface ProgrammerRepository {
    List<Programmer> findAll();
    Programmer findById(Long id);
    Programmer save(Programmer programmer);

    void addTaskToProgrammer(Long programmerId, Long taskId);
    void deleteTaskToProgrammer(Long programmerId, Long taskId);
    List<Task> findTasksByProgrammerId(Long id);

}
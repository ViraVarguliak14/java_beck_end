package com.varver.hom13_2.repository;

import com.varver.hom13_2.model.Programmer;

import java.util.List;

public interface ProgrammerRepository {
    List<Programmer> findAll();
    Programmer findById(Long id);
    Programmer save(Programmer programmer);
    void assignTaskToProgrammer(Long programmerId, Long taskId);
    void removeTaskFromProgrammer(Long programmerId, Long taskId);
}

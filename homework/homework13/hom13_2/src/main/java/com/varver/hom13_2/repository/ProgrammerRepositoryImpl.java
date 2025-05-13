package com.varver.hom13_2.repository;

import com.varver.hom13_2.model.Programmer;
import com.varver.hom13_2.model.Task;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Component
public class ProgrammerRepositoryImpl implements ProgrammerRepository {
    private final HashMap<Long, Programmer> programmers = new HashMap<>();


    static ProgrammerRepositoryImpl instance = new ProgrammerRepositoryImpl();{
        programmers.put(1L, new Programmer(1L, "Jack", new HashSet<>()));
        programmers.put(2L, new Programmer(2L, "Max", new HashSet<>()));
        programmers.put(3L, new Programmer(3L, "July", new HashSet<>()));
        programmers.put(4L, new Programmer(4L, "John", new HashSet<>()));
        programmers.put(5L, new Programmer(5L, "Vicki", new HashSet<>()));
        programmers.put(6L, new Programmer(6L, "Vera", new HashSet<>()));
    }

    public List<Programmer> findAll() {
        return programmers.values().stream().toList();
    }
    public Programmer findById(Long id) {
        return programmers.get(id);
    }

    public Programmer save(Programmer programmer) {
        return programmers.put(programmer.getId(), programmer);
    }
    @Override
    public void assignTaskToProgrammer(Long programmerId, Long taskId) {
         programmers.remove(programmerId);
    }

    @Override
    public void removeTaskFromProgrammer(Long programmerId, Long taskId) {
       programmers.remove(programmerId);
    }


}

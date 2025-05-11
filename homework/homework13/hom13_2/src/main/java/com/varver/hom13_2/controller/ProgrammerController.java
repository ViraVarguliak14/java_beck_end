package com.varver.hom13_2.controller;

import com.varver.hom13_2.model.Programmer;
import com.varver.hom13_2.repository.ProgrammerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProgrammerController {

    private final ProgrammerRepository programmerRepository;


    public ProgrammerController(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @GetMapping("/programmers")
    public List<Programmer> getAllProgrammers() {
        return programmerRepository.findAll();
    }

    @GetMapping("/programmers/{id}")
    public Programmer getProgrammerById(@PathVariable Long id) {
        return programmerRepository.findById(id);
    }

    @PostMapping("/programmers")
    public Programmer createProgrammer(@RequestBody Programmer programmer) {
        return programmerRepository.save(programmer);
    }

    @PutMapping("/{programmerId}/tasks/{taskId}")
    public ResponseEntity<Void> assignTask(@PathVariable Long programmerId, @PathVariable Long taskId) {
        programmerRepository.assignTaskToProgrammer(programmerId, taskId);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{programmerId}/tasks/{taskId}")
    public ResponseEntity<Void> removeTask(@PathVariable Long programmerId, @PathVariable Long taskId) {
        programmerRepository.removeTaskFromProgrammer(programmerId, taskId);
        return ResponseEntity.noContent().build();
    }

}

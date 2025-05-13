package com.varver.hom1.controller;



import com.varver.hom1.dto.ProgrammerDto;
import com.varver.hom1.repository.ProgrammerRepository;
import com.varver.hom1.service.ProgrammerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProgrammerController {
    private ProgrammerRepository programmerRepository;
    private final ProgrammerService programmerService;



    @GetMapping("/programmers")
    public List<ProgrammerDto> getProgrammers(){
        return programmerService.getAllProgrammers();
    }
//
//    @GetMapping("/programmers/{id}")
//    public Programmer getProgrammerById(@PathVariable("id") Long id){
//        return repository.findById(id);
//    }
//
//
//
//    @GetMapping("/programmers/{id}/tasks")
//    public List<Task> getTaskByProgrammer(@PathVariable("id") Long id){
//        return repository.findTasksByProgrammerId(id);
//    }
//
//
//    @PutMapping("/programmers/{programmerId}/tasks/{taskId}")
//    public void addTaskToProgrammer(@PathVariable("programmerId") Long programmerID, @PathVariable("taskId") Long taskId){
//        repository.addTaskToProgrammer(programmerID,taskId);
//    }

}

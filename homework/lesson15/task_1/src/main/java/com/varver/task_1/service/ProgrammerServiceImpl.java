package com.varver.task_1.service;

import com.varver.task_1.dto.ProgrammerDto;
import com.varver.task_1.model.Programmer;
import com.varver.task_1.repository.ProgrammerRepository;
import com.varver.task_1.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {
    private final ProgrammerRepository programmerRepository;
    private final TaskRepository taskRepository;

    @Override
    public List<ProgrammerDto> getAllProgrammers() {
        return programmerRepository.findAll()
                .stream()
                .map(programmer -> new ProgrammerDto(programmer.getName()))
                .toList();
    }

    public Programmer programmerFromDto(ProgrammerDto dto) {
        Programmer programmer = new Programmer();
        programmer.setName(dto.getName());
        return programmerRepository.save(programmer);
    }
}

package com.varver.hom1.service;


import com.varver.hom1.dto.ProgrammerDto;
import com.varver.hom1.model.Programmer;
import com.varver.hom1.repository.ProgrammerRepository;
import com.varver.hom1.repository.TaskRepository;
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

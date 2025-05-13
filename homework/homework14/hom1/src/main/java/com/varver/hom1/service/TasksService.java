package com.varver.hom1.service;



import com.varver.hom1.dto.TaskDto;

import java.util.List;

public interface TasksService {
    TaskDto createTask(TaskDto taskDto);
    List<TaskDto> getAllTasks();
}

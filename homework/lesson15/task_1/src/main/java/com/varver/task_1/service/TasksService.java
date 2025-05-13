package com.varver.task_1.service;

import com.varver.task_1.dto.TaskDto;

import java.util.List;

public interface TasksService {
    TaskDto createTask(TaskDto taskDto);
    List<TaskDto> getAllTasks();
}

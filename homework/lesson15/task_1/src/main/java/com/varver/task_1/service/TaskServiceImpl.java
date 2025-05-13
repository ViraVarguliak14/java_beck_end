package com.varver.task_1.service;

import com.varver.task_1.dto.TaskDto;
import com.varver.task_1.model.Task;
import com.varver.task_1.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TasksService {

    private final TaskRepository taskRepository;

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        Task task = new Task();
        task.setDescription(taskDto.getTaskDescription());
        task.setPriority(taskDto.getPriority());

        // Збереження Task в базі даних через репозиторій
        task = taskRepository.save(task);

        // Повернення нового TaskDto
        return new TaskDto(task.getDescription(), task.getPriority());
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskDto(task.getDescription(), task.getPriority()))
                .toList();
    }

}

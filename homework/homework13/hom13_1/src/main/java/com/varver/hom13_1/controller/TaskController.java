package com.varver.hom13_1.controller;

import com.varver.hom13_1.model.Task;
import com.varver.hom13_1.repository.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {


    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable(name = "id") Long taskId) {
        return taskRepository.findById(taskId);
    }

    @PostMapping("tasks")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping("tasks/{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable(name = "id") Long taskId) {
        if (taskRepository.existsById(taskId)) {
            taskRepository.deleteById(taskId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}

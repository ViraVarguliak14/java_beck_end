package com.varver.task_1.controller;

import com.varver.task_1.dto.TaskDto;
import com.varver.task_1.model.Task;
import com.varver.task_1.repository.TaskRepository;
import com.varver.task_1.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class TaskController {
    private final TaskRepository repository;
    private final TasksService tasksService;


    public TaskController(@Qualifier("taskRepositoryMapImpl") TaskRepository repository, TasksService tasksService) {
        this.repository = repository;
        this.tasksService = tasksService;
    }

    @GetMapping("/tasks")
    public List<TaskDto> getTasks(){
        return tasksService.getAllTasks();
    }

//
//    @GetMapping("/tasks/{id}")
//    public Task getTaskById(@PathVariable("id") Long taskId){
//        return repository.findById(taskId);
//    }
//
//    @PostMapping("/tasks")
//    public Task createNewTask(@RequestBody Task task){
//        System.out.println(task);
//        return repository.save(task);
//    }
//
//    @DeleteMapping("/tasks/{id}")
//    public  Task deleteTaskById(@PathVariable("id") Long id){
//        return repository.delete(id);
//    }



}

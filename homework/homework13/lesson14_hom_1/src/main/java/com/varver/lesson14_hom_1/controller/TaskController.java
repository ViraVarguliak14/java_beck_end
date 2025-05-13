package com.varver.lesson14_hom_1.controller;

/*
получить список всех задач
получить задачу по id
создать новую задачу
удалить задачу № ...
 */


import com.varver.lesson14_hom_1.model.Task;
import com.varver.lesson14_hom_1.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@AllArgsConstructor
@RestController
public class TaskController {
    private final TaskRepository repository;

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return repository.findAll();
    }


    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable("id") Long taskId){
        return repository.findById(taskId);
    }

    @PostMapping("/tasks")
    public Task createNewTask(@RequestBody Task task){
        System.out.println(task);
        return repository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public  Task deleteTaskById(@PathVariable("id") Long id){
        return repository.delete(id);
    }




}
package com.varver.hom13_2.repository;

import com.varver.hom13_2.model.Programmer;
import com.varver.hom13_2.model.Task;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TaskRepositoryImpl implements TaskRepository {

    private final Map<Long, Task> tasks = new HashMap<>();

    static TaskRepositoryImpl instance = new TaskRepositoryImpl();{
        tasks.put(1L, new Task(1L, "Создать REST API для управления пользователями"));
        tasks.put(2L, new Task(2L, "Добавить вход через Google OAuth2"));
        tasks.put(3L, new Task(3L, "Оптимизировать SQL-запросы в модуле отчетности"));
        tasks.put(4L, new Task(4L, "Реализовать тёмную тему в пользовательском интерфейсе"));
        tasks.put(5L, new Task(5L, "Написать юнит-тесты для сервисного слоя"));
    }


    @Override
    public List<Task> findAll() {
        return new ArrayList<>();
    }
    @Override
    public Task findById(Long id) {
        return tasks.get(id);
    }
    public Task save(Task task) {
        return tasks.put(task.getId(), task);
    }

    @Override
    public void deleteById(Long id){
        tasks.remove(id);
    }



}

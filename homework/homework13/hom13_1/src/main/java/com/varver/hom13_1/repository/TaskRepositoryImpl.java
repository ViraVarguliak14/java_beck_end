package com.varver.hom13_1.repository;

import com.varver.hom13_1.model.Task;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class TaskRepositoryImpl implements TaskRepository {
    private final HashMap<Long, Task> map = new HashMap<>();

    static TaskRepositoryImpl instance;{
        map.put(1L, new Task(1L, "Сделать домашнее задание", "HIGH"));
        map.put(2L, new Task(2L, "Подготовка к экзамену по немецкому", "HIGH"));
        map.put(3L, new Task(3L, "Подготовить структуру папок для портфолио своего сайта", "MEDIUM"));
        map.put(4L, new Task(4L, "Забрать справку из школы", "LOW"));
        map.put(5L, new Task(5L, "Записаться к врачу", "MEDIUM"));
        map.put(6L, new Task(6L, "Написать письмо в джоб-центр", "MEDIUM"));
    }

    public List<Task> findAll() {
        return map.values().stream().toList();
    }

    public Task findById(Long id) {
        return map.get(id);
    }

    @Override
    public Task save(Task task) {
            return task;
    }

    @Override
    public boolean existsById(Long id) {
        return map.containsKey(id);
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}

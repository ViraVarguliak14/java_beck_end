package com.varver.task_1.repository;

import com.varver.task_1.model.Priority;
import com.varver.task_1.model.Task;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


/*
@Component

@Controller
@RestController
@Repository
@Service
@Configuration
@Bean

 */

@Repository
@AllArgsConstructor
public class TaskRepositoryMapImpl implements TaskRepository {
    private static HashMap<Long, Task> map = new HashMap<>();
    private static Long lastId = 5L;

    static {
        map.put(1L, new Task(1L,"Task 1", Priority.LOW));
        map.put(2L, new Task(2L,"Task 2", Priority.HIGH));
        map.put(3L, new Task(3L,"Task 3", Priority.LOW));
        map.put(4L, new Task(4L,"Task 4", Priority.MIDDLE));
        map.put(5L, new Task(5L,"Task 5", Priority.LOW));
    }

    @Override
    public List<Task> findAll() {
        return map.values().stream().toList(); //Повертає список усіх задач у map.
    }

    @Override
    public Task findById(Long id) {
        if (id<1 || id>lastId){
            throw new RuntimeException("id not found");
        }
        return map.get(id);
        //Перевіряє, чи існує задача за ID
        //
        //Якщо ні — викидає помилку
        //
        //Інакше — повертає задачу
    }

    @Override
    public Task save(Task task) {
        task.setId(++lastId);//Присвоює новий ID
        map.put(lastId,task);// Додає в мапу
        return task;
    }

    @Override
    public Task delete(Long id) {
        return map.remove(id);// Видаляє і повертає задачу
    }
}

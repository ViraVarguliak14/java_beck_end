package com.varver.hom1.dto;


import com.varver.hom1.model.Priority;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TaskDto {
    private String taskDescription;
    private Priority priority;

    public TaskDto(String taskDescription, Priority priority) {
        this.taskDescription = taskDescription;
        this.priority = priority;
    }
}

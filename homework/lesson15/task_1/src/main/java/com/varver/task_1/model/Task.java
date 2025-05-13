package com.varver.task_1.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class Task {
    private Long id;
    private String description;
    private Priority priority;
}




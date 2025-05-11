package com.varver.hom13_1.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Task {
    private Long id;
    private String description;
    private String priority;
}

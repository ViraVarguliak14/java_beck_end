package com.varver.hom13_1.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Task {
    @Setter
    private Long id;
    private String description;
    private String priority;
}

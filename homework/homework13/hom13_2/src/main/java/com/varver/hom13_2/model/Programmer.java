package com.varver.hom13_2.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Programmer {
    private Long id;
    private String name;
    private Set<Task> tasks = new HashSet<>();


}

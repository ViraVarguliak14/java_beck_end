package com.varvera;

import lombok.*;

import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;



}










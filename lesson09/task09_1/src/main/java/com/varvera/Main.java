package com.varvera;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jack", 10, 30, 105);
        int w = p.getWeight();
        System.out.println(p);
        Person vera = Person.builder()
                .name("Vera")
                .age(39)
                .height(164)
                .build();
        System.out.println(vera);



    }
}
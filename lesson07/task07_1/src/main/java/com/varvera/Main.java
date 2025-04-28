package com.varvera;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Person p = new Person("Jack", 18);
        Person[] people = {
                new Person("John", 22),
                new Person("Lena", 35),
                new Person("Vera", 39),
                new Person("Max", 45),
        };


          String json = mapper.writeValueAsString(p);
          mapper.writeValue(new File("p1.json"),p);
          mapper.writeValue(new File("p2.json"),people);

            System.out.println(json);

          Person person =  mapper.readValue(new File("p1.json"), Person.class);
          Person[] people1 =  mapper.readValue(new File("p2.json"), Person[].class);
        System.out.println("perso: " + person);
        System.out.println(Arrays.toString(people1));



    }
}
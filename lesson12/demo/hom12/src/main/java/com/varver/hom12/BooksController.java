package com.varver.hom12;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Books> getBooks() {
        List<Books> booksList = new ArrayList<Books>();
        booksList.add(new Books("Путь к финансовой свободе", "Бодо Шефер", 1998));
        booksList.add(new Books("Богатый папа, бедный папа", "Роберт Кийосаки", 1997));
        booksList.add(new Books("Унесённые ветром", "Маргарет Митчелл", 1936));

        return booksList;
    }

}

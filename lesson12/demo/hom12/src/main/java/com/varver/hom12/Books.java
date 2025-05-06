package com.varver.hom12;

public class Books {
    String title;
    String author;
    int age;


    public Books() {}
    public Books(String title, String author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                '}';
    }
}

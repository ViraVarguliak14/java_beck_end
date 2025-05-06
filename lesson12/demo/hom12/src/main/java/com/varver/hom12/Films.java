package com.varver.hom12;

public class Films {
    String title;
    String creator;
    int year;
    String actors;

    public Films(){}

    public Films(String title, String creator, int year, String actors) {
        this.title = title;
        this.creator = creator;
        this.year = year;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public int getYear() {
        return year;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", creator='" + creator + '\'' +
                ", year=" + year +
                ", actors='" + actors + '\'' +
                '}';
    }
}

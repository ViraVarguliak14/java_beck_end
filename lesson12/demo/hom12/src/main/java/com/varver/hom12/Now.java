package com.varver.hom12;

import java.time.LocalDate;
import java.time.LocalTime;

public class Now {

    private LocalDate date;
    private LocalTime time;

    public Now(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Now{" +
                "date=" + date +
                ", time=" + time +
                '}';
    }
}

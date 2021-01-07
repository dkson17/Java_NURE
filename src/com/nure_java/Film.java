package com.nure_java;

// 3. Опишите базовый класс фильмов и производные.

public class Film {
    public String name;
    public double rating;
    public double duration;
    public String age_limit;

    public Film(String n,double r, double d, String al) {
        this.name = n;
        this.rating = r;
        this.duration = d;
        this.age_limit = al;
    }
}

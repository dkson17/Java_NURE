package com.nure_java;

public class Thriller extends Film {
    public String[] tags;

    public Thriller(String n,double r, double d, String al, String[] t) {
        super(n, r, d, al);

        this.tags = t;
    }
}

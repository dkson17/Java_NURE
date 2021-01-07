package com.nure_java;

public class Comedy extends Film {
    public String comedy_genre;

    public Comedy(String n, double r, double d, String al, String cg) {
        super(n, r, d, al);
        this.comedy_genre = cg;
    }
}

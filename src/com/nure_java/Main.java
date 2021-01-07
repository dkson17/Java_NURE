package com.nure_java;

public class Main {

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 4, 2, 4, 5, 8};

        FindMostRepeatedNumberInArray.call(array);

        Circle c1 = new Circle(3,3, 4);
        Circle c2 = new Circle(24,18, 1);

        System.out.println(Circle.checkOverlap(c1, c2));

        Comedy comedy = new Comedy("The Christmas Chronicles", 7.0, 104, "13+", "Comedy music");

        String[] thriller_tags = {"serial killer", "detective", "seven deadly sins","serial murder","murder"};
        Thriller thriller = new Thriller("7even", 7.0, 104, "17+", thriller_tags);

        System.out.println(comedy.name + ": " + comedy.comedy_genre);
        System.out.println(thriller.name + ": " + thriller.age_limit);
    }
}

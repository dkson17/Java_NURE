package com.nure_java;

// Опишите класс окружностей Circle. Задайте функцию, вычисляющую длину окружности.
// Задайте функцию,проверяющую, пересекаются ли две окружности.

public class Circle {
    public double x;
    public double y;
    public double radius;

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    };

    public double circumference() {
        return Math.PI * 2*radius;
    }

    public static boolean checkOverlap(Circle c1, Circle c2) {
        return Math.hypot(c1.x - c2.x, c1.y - c2.y) < c1.radius + c2.radius;
    }
}

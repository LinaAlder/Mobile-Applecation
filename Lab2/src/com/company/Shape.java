package com.company;

import java.util.Objects;

abstract class Shape implements Comparable<Shape> {

    protected double x, y;

    Shape() {
        x = 0;
        y = 0;
    }

    Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double area();

    public int compareTo(Shape s) {
        return Double.compare(this.area(), s.area());
    }

    public abstract String toString();

    public abstract int hashCode();


}

class Rect extends Shape {

    protected double width, height;
    Rect() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }

    Rect(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    @Override
    public double area() {
        return width * height;
    }

    public String toString() {
        return "Rectangle with location {" + this.x + "," + this.y + "}, width: " + this.width + ", height: " + this.height + ", area: " + this.area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rect rect = (Rect) o;
        return Double.compare(rect.width, width) == 0 &&
                Double.compare(rect.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

class Circle extends Shape {

    protected double radius;

    Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with location {" + this.x + "," + this.y + "}, radius: " + this.radius + ", area: " + this.area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

class Square extends Shape {

    protected double edge;

    Square() {
        this.x = 0;
        this.y = 0;
        this.edge = 1;
    }

    Square(double x, double y, double e) {
        this.x = x;
        this.y = y;
        edge = e;
    }

    @Override
    public double area() {
        return edge;
    }

    public String toString() {
        return "Square with location {" + this.x + "," + this.y + "}, edge: " + this.edge + ", area: " + this.area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }
}

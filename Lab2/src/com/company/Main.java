package com.company;


import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet list = new TreeSet();
        Rect r = new Rect(1, 1, 2, 4);
        Circle c = new Circle(2, 4, 10);
        Square s = new Square(1, 1, 2);
        list.add(r);
        list.add(c);
        list.add(s);

        System.out.println(list);

    }
}

package com.company.java_core.homework2.task1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 3);

        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        System.out.println("Area of first rectangle = " + (length * width));
        System.out.println("Perimeter of first rectangle = " + ((length * 2) + (width * 2)));

        Rectangle rectangle1 = new Rectangle();

        System.out.println("Area of second rectangle = " + rectangle1.Area());
        System.out.println("Perimeter of second rectangle = " + rectangle1.Perimeter());
    }
}

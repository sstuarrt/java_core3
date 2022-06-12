package com.company.java_core.homework2.task1;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        length = 13;
        width = 5;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double Area(){
        double area = length * width;
        return area;
    }

    public double Perimeter(){
        double perimeter = (length * 2) + (width * 2);
        return perimeter;
    }
}

package com.knoldus.Question9;


//demonstrating polymorphism
public class Shape
{
    public void draw()
    {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("drawing a triangle");
    }
}

class DrawingShape
{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        circle1.draw();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();
        Triangle triangle1 = new Triangle();
        triangle1.draw();
    }
}
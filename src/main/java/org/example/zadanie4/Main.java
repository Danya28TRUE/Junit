package org.example.zadanie4;

//абстрактный класс Figure
abstract class Figure {
    public abstract void calculateArea();
}

//класс Circle расширяет класс Figure
class Circle extends Figure {
    @Override
    public void calculateArea() {
        System.out.println("Вычисление площади круга");
    }
}

//класс Rectangle расширяет класс Figure
class Rectangle extends Figure {
    @Override
    public void calculateArea() {
        System.out.println("Вычисление площади прямоугольника");
    }
}

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle();
        Figure rectangle = new Rectangle();

        circle.calculateArea(); // Выведет "Вычисление площади круга"
        rectangle.calculateArea(); // Выведет "Вычисление площади прямоугольника"
    }
}
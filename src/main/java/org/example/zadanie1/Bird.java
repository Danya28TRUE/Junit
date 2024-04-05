package org.example.zadanie1;

public class Bird extends Animal implements Vehicle {
    @Override
    public void move() {
        System.out.println("Птица летит");
    }

    @Override
    public void eat() {
        System.out.println("Птица ест");
    }
}
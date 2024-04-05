package org.example.zadanie2;

// Абстрактный класс
abstract class Animal {
    abstract void sound();
}

// Класс, наследующий абстрактный класс
class Dog extends Animal {
    void sound() {
        System.out.println("воет");
    }
}

// Интерфейс
interface Jumpable {
    void jump();
}

// Класс, реализующий интерфейс
class Cat implements Jumpable {
    public void jump() {
       System.out.println("кот прыгает");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Вывод: воет

        Cat cat = new Cat();
       cat.jump(); // Вывод: кот прыгает
    }
}

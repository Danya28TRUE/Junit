package org.example.zadanie5;

//
interface Transport {
    void move();
}

//класс Car рефлизует Transport
class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Автомобиль движется по дороге");
    }
}

//класс Bicycle рефлизует Transport
class Bicycle implements Transport {
    @Override
    public void move() {
        System.out.println("Велосипед движется по улице");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();// создание объекта car
        Transport bicycle = new Bicycle();// создание объекта bicycle

        car.move(); // Выведет "Автомобиль движется по дороге"
        bicycle.move(); // Выведет "Велосипед движется по улице"
    }
}
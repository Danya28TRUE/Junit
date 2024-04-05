package org.example.zadanie5;

import static org.junit.jupiter.api.Assertions.*;

public class TransportTest {

    @org.junit.Test
    public void testCar() {
        Transport car = new Car();
        assertTrue(car instanceof Transport); // Проверяем, реализует ли Car интерфейс Transport
        assertDoesNotThrow(() -> car.move());// Проверяем, реализует ли car метод move
    }

   @org.junit.Test
   public void testBicycle() {
      Transport bicycle = new Bicycle();
      assertTrue(bicycle instanceof Transport); // Проверяем, реализует ли Bicycle  интерфейс Transport
       assertDoesNotThrow(() -> bicycle.move());// Проверяем, реализует ли bicycle метод move
  }
}
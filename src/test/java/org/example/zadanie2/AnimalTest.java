package org.example.zadanie2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void testDog() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal); // Проверяем, наследует ли Dog класс Animal
        assertDoesNotThrow(() -> dog.sound());// Проверяем, реализует ли dog метод sound
    }


    @Test
    public void testCatJump() {
        Cat cat = new Cat();
        assertTrue(cat instanceof Jumpable); // Проверяем, реализует ли Cat интерфейс Jumpable\
        assertDoesNotThrow(() -> cat.jump());// Проверяем, реализует ли cat метод jump
    }
}

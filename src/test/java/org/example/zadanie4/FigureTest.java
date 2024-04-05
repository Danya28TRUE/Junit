package org.example.zadanie4;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {

    @Test
    public void testCircle() {
        Figure circle = new Circle();
        assertTrue(circle instanceof Figure); // Проверяем, наследует ли Circle класс Figure
        assertDoesNotThrow(() ->  circle.calculateArea());// Проверяем, реализует ли circle метод calculateArea
    }

    @Test
    public void testRectangle() {
        Figure rectangle = new Rectangle();
        assertTrue( rectangle instanceof Figure); // Проверяем, наследует ли Rectangle класс Figure
        assertDoesNotThrow(() -> rectangle.calculateArea());// Проверяем, реализует ли rectangle метод calculateArea
    }
}

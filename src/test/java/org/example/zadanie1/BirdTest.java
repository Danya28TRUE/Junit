package org.example.zadanie1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BirdTest {

    @Test
    public void testMove() {
        Bird bird = new Bird();
        assert (bird instanceof Vehicle); // Проверяем, реализует ли Bird интерфейс Vehicle
    }

    @Test
    public void testEat() {
        Bird bird = new Bird();
        assertTrue(bird instanceof Animal); // Проверяем, является ли Bird потомком Animal
    }
}
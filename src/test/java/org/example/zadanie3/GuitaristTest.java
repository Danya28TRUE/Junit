package org.example.zadanie3;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuitaristTest {

    @Test
    void testGuitarist() {
        Musician guitarist = new Guitarist();
        assertTrue(guitarist instanceof Musician); // Проверяем, реализует ли guitarist интерфейс Musician
        assertDoesNotThrow(() -> guitarist.playSolo());// Проверяем, реализует ли guitarist метод playSolo
        assertDoesNotThrow(() -> guitarist.rehearse());// Проверяем, реализует ли guitarist метод playSolo
    }
}

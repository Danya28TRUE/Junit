package org.example.zadanie3;

//интерфейс Musician
interface Musician {
    void playSolo();
    void rehearse();
}

//класс Guitarist реализует Musician
class Guitarist implements Musician {
    @Override
    public void playSolo() {
        System.out.println("Играю на гитаре соло");
    }

    @Override
    public void rehearse() {
        System.out.println("Репетирую на гитаре");
    }
}

public class Main {
    public static void main(String[] args) {
        Musician guitarist = new Guitarist();
        guitarist.playSolo(); // Выведет "Играю на гитаре соло"
        guitarist.rehearse(); // Выведет "Репетирую на гитаре"
    }
}

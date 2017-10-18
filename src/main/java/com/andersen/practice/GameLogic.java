package com.andersen.practice;

class GameLogic {
    GameLogic() {
        // Инициализация поля
        Field f = new Field();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(f.getField(i, j));
            System.out.println();
        }
    }

    void start() {
        System.out.println("Добро пожаловать в игру \"Крестики-нолики\"!");
        System.out.println("");

    }

}

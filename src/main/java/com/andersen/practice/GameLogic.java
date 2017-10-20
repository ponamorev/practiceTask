package com.andersen.practice;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class GameLogic {
    GameLogic() {
    }

    void start() throws IOException {
        System.out.println("Добро пожаловать в игру \"Крестики-нолики\"!");
        System.out.println("Перед вами пронумерованные ячейки поля.");
        System.out.println("Ваш ход первый.\n");
        // Инициализация поля для игры
        Field field = new Field();
        // Вывод на экран
        field.printField();
        // создание объекта типа Random для генерации псевдослучайных чисел
        Random random = new Random();
        // создание объекта типа Scanner для ввода значений через консоль
        Scanner inputStream = new Scanner(System.in);
        // Делаем поле пустым
        field.emptyField();

        // Цикл круга игры "человек-компьютер"
        do {
            // Человек
            System.out.println("\nВаш ход.");
            System.out.println("Выберите номер свободной ячейки:");
            int state = -1;
            while (state == -1) {
                int temp = inputStream.nextInt();
                // выбор и заполнение ячейки
                switch (temp) {
                    case 1:
                        if (field.getField(0, 0) == "X" || field.getField(0, 0) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(0, 0, "X");
                            break;
                        }
                    case 2:
                        if (field.getField(0, 2) == "X" || field.getField(0, 2) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(0, 2, "X");
                            break;
                        }
                    case 3:
                        if (field.getField(0, 4) == "X" || field.getField(0, 4) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(0, 4, "X");
                            break;
                        }
                    case 4:
                        if (field.getField(1, 0) == "X" || field.getField(1, 0) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(1, 0, "X");
                            break;
                        }
                    case 5:
                        if (field.getField(1, 2) == "X" || field.getField(1, 2) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(1, 2, "X");
                            break;
                        }
                    case 6:
                        if (field.getField(1, 4) == "X" || field.getField(1, 4) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(1, 4, "X");
                            break;
                        }
                    case 7:
                        if (field.getField(2, 0) == "X" || field.getField(2, 0) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(2, 0, "X");
                            break;
                        }
                    case 8:
                        if (field.getField(2, 2) == "X" || field.getField(2, 2) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(2, 2, "X");
                            break;
                        }
                    case 9:
                        if (field.getField(2, 4) == "X" || field.getField(2, 4) == "0") {
                            System.out.println("Эта ячейка занята. Повторите ввод.");
                            break;
                        } else {
                            state = 1;
                            field.setField(2, 4, "X");
                            break;
                        }
                    default:
                        System.out.println("Нет такого номера ячейки. Повторите ввод.");
                }
            }

            field.printField();
            // проверка условия после хода игрока
            if (field.getNoWin() == true || field.getWinX() == true || field.getWinO() == true)
                break;

            // Компьютер
            System.out.println("\nХод компьютера.");
            state = -1;
            while (state == -1) {
                int temp = random.nextInt(10);
                if (temp > 0 & temp < 10) {
                    switch (temp) {
                        case 1:
                            if (field.getField(0, 0) == "X" || field.getField(0, 0) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(0, 0, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 2:
                            if (field.getField(0, 2) == "X" || field.getField(0, 2) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(0, 2, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 3:
                            if (field.getField(0, 4) == "X" || field.getField(0, 4) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(0, 4, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 4:
                            if (field.getField(1, 0) == "X" || field.getField(1, 0) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(1, 0, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 5:
                            if (field.getField(1, 2) == "X" || field.getField(1, 2) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(1, 2, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 6:
                            if (field.getField(1, 4) == "X" || field.getField(1, 4) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(1, 4, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 7:
                            if (field.getField(2, 0) == "X" || field.getField(2, 0) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(2, 0, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 8:
                            if (field.getField(2, 2) == "X" || field.getField(2, 2) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(2, 2, "0");
                                System.out.println(temp);
                                break;
                            }
                        case 9:
                            if (field.getField(2, 4) == "X" || field.getField(2, 4) == "0")
                                break;
                            else {
                                state = 1;
                                field.setField(2, 4, "0");
                                System.out.println(temp);
                                break;
                            }
                    }
                }
            }

            field.printField();
            // проверка условия после хода игрока
            if (field.getNoWin() == true || field.getWinX() == true ||field.getWinO()== true)
                break;
        } while (true);
        if (field.getNoWin())
            System.out.println("Ничья.");
        else if (field.getWinX())
            System.out.println("Вы победили.");
        else if (field.getWinO())
            System.out.println("Победил компьютер.");
        endGame();
    }

    void endGame() throws IOException {
        System.out.println("Для того, чтобы сыграть ещё раз, нажмите цифру от 1 до 9.");
        System.out.println("Для выхода нажмите 0.");
        Scanner in = new Scanner(System.in);
        int replay = in.nextInt();
        if (replay == 0) {
            System.out.println("Спасибо за игру.");
        } else if (replay > 0 & replay < 10)
            start();
        else {
            System.out.println("Слишком сложно, нажмите что-нибудь попроще.");
            endGame();
        }
    }
}

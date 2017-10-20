package com.andersen.practice;

class Field {
    private String field[][] = new String[3][5];
    private boolean winX, winO, noWin;

    // Первичная инициализация поля
    Field() {
        int count = 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0)
                    field[i][j] = String.valueOf(count++);
                else field[i][j] = " ";
            }
    }

    // устанавливаем значения ячейки
    void setField(int str, int col, String val) {
        field[str][col] = val;
    }

    // получаем значение ячейки
    String getField(int str, int col) {
        return field[str][col];
    }

    boolean getWinX() {
        return (field[0][0] == "X" && field[0][2] == "X" && field[0][4] == "X") ||
                (field[1][0] == "X" && field[1][2] == "X" && field[1][4] == "X") ||
                (field[2][0] == "X" && field[2][2] == "X" && field[2][4] == "X") ||
                (field[0][0] == "X" && field[1][0] == "X" && field[2][0] == "X") ||
                (field[0][2] == "X" && field[1][2] == "X" && field[2][2] == "X") ||
                (field[0][4] == "X" && field[1][4] == "X" && field[2][4] == "X") ||
                (field[0][0] == "X" && field[1][2] == "X" && field[2][4] == "X") ||
                (field[0][4] == "X" && field[1][2] == "X" && field[2][0] == "X");
    }

    boolean getWinO() {
        return (field[0][0] == "0" && field[0][2] == "0" && field[0][4] == "0") ||
                (field[1][0] == "0" && field[1][2] == "0" && field[1][4] == "0") ||
                (field[2][0] == "0" && field[2][2] == "0" && field[2][4] == "0") ||
                (field[0][0] == "0" && field[1][0] == "0" && field[2][0] == "0") ||
                (field[0][2] == "0" && field[1][2] == "0" && field[2][2] == "0") ||
                (field[0][4] == "0" && field[1][4] == "0" && field[2][4] == "0") ||
                (field[0][0] == "0" && field[1][2] == "0" && field[2][4] == "0") ||
                (field[0][4] == "0" && field[1][2] == "0" && field[2][0] == "0");
    }

    boolean getNoWin() {
        return ((field[0][0] == "X" || field[0][0] == "0") &
                (field[0][2] == "X" || field[0][2] == "0") &
                (field[0][4] == "X" || field[0][4] == "0") &
                (field[1][0] == "X" || field[1][0] == "0") &
                (field[1][2] == "X" || field[1][2] == "0") &
                (field[1][4] == "X" || field[1][4] == "0") &
                (field[2][0] == "X" || field[2][0] == "0") &
                (field[2][2] == "X" || field[2][2] == "0") &
                (field[2][4] == "X" || field[2][4] == "0") &
                getWinX() == false & getWinO() == false);
    }

    void printField() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\t");
            for (int j = 0; j < 5; j++)
                System.out.print(field[i][j]);
            System.out.println();
        }
    }

    void emptyField() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0)
                    field[i][j] = "_";
                else field[i][j] = " ";
            }
    }
}

package com.andersen.practice;

class Field {
    private String field[][] = new String[3][5];

    // Первичная инициализация поля
    Field() {
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 || i == 5) {
                    if (j != 2 && j != 5)
                        field[i][j] = " ";
                    else field[i][j] = "|";
                }
                else if (j != 2 && j != 5)
                    field[i][j] = "_";
                else field[i][j] = "|";
            }
        }*/
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0)
                    field[i][j] = "_";
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
}

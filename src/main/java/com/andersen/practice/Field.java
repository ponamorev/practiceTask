package com.andersen.practice;

class Field {
    private String field[][] = new String[3][5];

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
}

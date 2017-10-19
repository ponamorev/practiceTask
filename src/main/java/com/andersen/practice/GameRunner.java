package com.andersen.practice;

import java.io.IOException;

public class GameRunner {
    public static void main(String[] args) throws IOException {
        GameLogic gameLogic = new GameLogic();
        gameLogic.start();
    }
}

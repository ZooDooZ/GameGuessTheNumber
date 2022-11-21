package com.guessNumberGame;

import java.util.Random;

public class Computer {

    private static int computerNumber;

    public int getComputerNumber() {
        return computerNumber;
    }

    // method responsible for drawing number from computer
    public void drawingNumberByComputer(int gameLevel) {
        Random random = new Random();
        if (gameLevel == 1) {
            computerNumber = random.nextInt(1, 20);
        } else if (gameLevel == 2) {
            computerNumber = random.nextInt(1, 40);
        } else if (gameLevel == 3) {
            computerNumber = random.nextInt(1, 100);
        }
    }

}

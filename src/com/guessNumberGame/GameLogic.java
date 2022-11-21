package com.guessNumberGame;

public class GameLogic {

    private Computer computer = new Computer();
    private Input input = new Input();


    // method responsible for start game
    public void startGame() {
        Display.printStartLabel();
        Display.printMenu();
        input.chooseMenuOption();
    }

    // method responsible for logic game
    public void game() {
        int gameLevel = input.chooseGameLevel();
        computer.drawingNumberByComputer(gameLevel);
        compareNumberPlayerAndComputer();
        input.repeatGame();
    }

    // method responsible for compare two number player with computer
    public void compareNumberPlayerAndComputer() {
        int chancePerGameLevel = input.getChancePerGameLevel();
        for (int i = 0; i < chancePerGameLevel; i++) {
            int playerNumber = input.askingPlayerAboutNumber();
            System.out.println(computer.getComputerNumber());

            if (playerNumber == computer.getComputerNumber()) {
                Display.printInfoIfYouHitAnswer();
                input.repeatGame();
            } else if (playerNumber > computer.getComputerNumber()) {
                Display.printMessage("Your number is greater than the computer! Try again!");
            } else if (playerNumber < computer.getComputerNumber()) {
                Display.printMessage("Your number is less than the computer! Try again!");
            }
        }
        Display.printMessage("\nOh no! You used " + chancePerGameLevel + " chances!");
        Display.printInfoIfYouMissAllAnswer();
    }
}

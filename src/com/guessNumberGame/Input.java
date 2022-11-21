package com.guessNumberGame;

import java.util.Scanner;

public class Input {

    private int numWithGameLvl;
    private int highestNumberInThisGame;
    private int chancePerGameLevel;

    Scanner scanner = new Scanner(System.in);

    public int getChancePerGameLevel() {
        return chancePerGameLevel;
    }

    // method responsible for choose menu option from player
    public void chooseMenuOption() {
        boolean answer = true;

        while (answer) {
            Display.printMessage("Select options:");
            String playerChoose = scanner.nextLine();
            if (playerChoose.equalsIgnoreCase("Start game") || Integer.parseInt(playerChoose) == 1) {
                GameLogic gameLogic = new GameLogic();
                gameLogic.game();
                answer = false;
            } else if (playerChoose.equalsIgnoreCase("Information about rules") || Integer.parseInt(playerChoose) == 2) {
                Display.printInformationAboutRules();
                Display.printMenu();
            } else if (playerChoose.equalsIgnoreCase("Information about author") || Integer.parseInt(playerChoose) == 3) {
                Display.printInfoAboutAuthor();
                Display.printMenu();
            } else if (playerChoose.equalsIgnoreCase("Exit game") || Integer.parseInt(playerChoose) == 4) {
                Display.printMessage("You are exit this game!");
                Display.printMessage("See you next time!");
                answer = false;
            } else {
                Display.printMessage("Wrong choice - select one more time.");
            }
        }
    }

    // method responsible for choose game level from player
    public int chooseGameLevel() {
        boolean answer = true;

        while (answer) {
            Display.printQuestionAboutLevelGame();
            Display.printMessage("Select game level:");
            String playerChoose = scanner.nextLine();

            if (playerChoose.equalsIgnoreCase("Easy") || Integer.parseInt(playerChoose) == 1) {
                answer = false;
                numWithGameLvl = 1;
                highestNumberInThisGame = 20;
                chancePerGameLevel = 5;
            } else if (playerChoose.equalsIgnoreCase("Medium") || Integer.parseInt(playerChoose) == 2) {
                answer = false;
                numWithGameLvl = 2;
                highestNumberInThisGame = 40;
                chancePerGameLevel = 6;
            } else if (playerChoose.equalsIgnoreCase("Hard") || Integer.parseInt(playerChoose) == 3) {
                answer = false;
                numWithGameLvl = 3;
                highestNumberInThisGame = 100;
                chancePerGameLevel = 7;
            } else {
                Display.printMessage("Wring choice - select one more time");
            }
        }
        return numWithGameLvl;
    }

    // method responsible for choose player number
    public int askingPlayerAboutNumber() {
        int playerNumber = 0;
        boolean isCorrectNumber = true;

        while (isCorrectNumber) {
            System.out.printf("Time to your shot! Type your number (between %d - %d):\n", 1, highestNumberInThisGame);
            playerNumber = scanner.nextInt();

            if (numWithGameLvl == 1 && playerNumber >= 1 && playerNumber <= 20) {
                isCorrectNumber = false;
                return playerNumber;
            }
            if (numWithGameLvl == 2 && playerNumber >= 1 && playerNumber <= 40) {
                isCorrectNumber = false;
                return playerNumber;
            }
            if (numWithGameLvl == 3 && playerNumber >= 1 && playerNumber <= 100) {
                isCorrectNumber = false;
                return playerNumber;
            }
            Display.printMessage("You entered the wrong number!");
        }
        return playerNumber;
    }

    public void repeatGame() {
        GameLogic gameLogic = new GameLogic();

        scanner.nextLine();
        System.out.println("Do you want to play again (yes/no)?");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase("yes")) {
            gameLogic.game();
        } else if (str.equalsIgnoreCase("no")) {
            Display.printMessage("Thank you! See you next time!");
            System.exit(0);
        } else {
            Display.printMessage("Wrong answer!");
        }


    }
}

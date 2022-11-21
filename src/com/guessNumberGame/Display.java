package com.guessNumberGame;

import java.sql.SQLOutput;

public class Display {

    // display welcome and name game
    public static void printStartLabel() {
        System.out.println("\nWelcome to GUESS NUMBER GAME!\n");
        System.out.println("Try to guess what number your computer chose!\n");
    }

    // display game menu
    public static void printMenu() {
        System.out.println("\n====================MENU=====================");
        System.out.println("1. Start game");
        System.out.println("2. Information about rules");
        System.out.println("3. Information about author");
        System.out.println("4. Exit game");
        System.out.println("=============================================");
    }

    // display menu about game level
    public static void printQuestionAboutLevelGame() {
        System.out.println("\n=================GAME LEVEL====================");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("=============================================");
    }

    // display information about game author
    public static void printInfoAboutAuthor() {
        System.out.println("Author: Filip Sokolowski - Java Developer");
    }

    // method that allows to add a string at some place
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // display information when u hit answer
    public static void printInfoIfYouHitAnswer() {
        System.out.println("Correct answer!\nYOU WIN!");
    }

    // display information when you miss all chances
    public static void printInfoIfYouMissAllAnswer() {
        System.out.println("You didn't get the correct answer!\nYOU LOSE!");
    }

    // display rules of the game
    public static void printInformationAboutRules() {
        System.out.println("=====================RULES====================");
        System.out.println("When you start the game, computer draws one number between:\n" +
                "\t* Level Easy: 1-20 - You have 3 chance to hit correct answer\n" +
                "\t* Level Medium: 1-40 - You have 3 chance to hit correct answer\n" +
                "\t* Level Hard - You have 3 chance to hit correct answer\n" +
                "Select your game level and try to your luck!\n" +
                "Look at the some advice after shot!\n" +
                "Remember, you have only 3 chance to answer correct number!\n" +
                "GOOD LUCK!");
        System.out.println("========================================+=====");
    }
}

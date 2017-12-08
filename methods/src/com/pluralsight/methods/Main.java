package com.pluralsight.methods;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("final score is : " + highScore);

        int highScorePosition = calculatehighScorePosition(1500);
        displayHighScorePosition("Baris",highScorePosition);

        highScorePosition = calculatehighScorePosition(900);
        displayHighScorePosition("Pinar",highScorePosition);

        highScorePosition = calculatehighScorePosition(400);
        displayHighScorePosition("Javacan",highScorePosition);

        highScorePosition = calculatehighScorePosition(50);
        displayHighScorePosition("John",highScorePosition);

    }


    public static void displayHighScorePosition(String playerName,int highScorePosition) {

        System.out.println(playerName + " managed get into position " + highScorePosition + " on the high score table");

    }
    public static int calculatehighScorePosition(int playerScore) {

        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >=100 && playerScore < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;
            return finalScore;
        }
        else
            return -1;
    }
}

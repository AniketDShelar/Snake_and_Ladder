package com.intellijide.snakeandladder;

import java.util.Scanner;

public class SnakeAndLadder {
    static int player1Position = 0;
    static final int NO_PLAY = 0;
    static final int GET_LADDER = 1;
    static final int GET_SNAKE = 2;
    static final int STARTING_POINT = 0;
    static final int WINNING_POINT = 100;
    public static int rollDie(){
        System.out.println("Please roll a die");
        int dieNumber = (int)(Math.random() * 10 % 6) + 1;
        System.out.println("You get : " +dieNumber);
        return dieNumber;
    }
    static int checkOption(){
        int option = (int)(Math.random() * 10) % 3;
        return option;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        System.out.println("--------------------------------");
//        SnakeAndLadder snakenladder = new SnakeAndLadder();
        int diceCount = 0;
        while(player1Position < WINNING_POINT) {
            int dieNumber = rollDie();
            diceCount++;
            switch (checkOption()) {
                case NO_PLAY:
                    System.out.println("No play");
                    break;
                case GET_LADDER:
                    System.out.println("you got ladder");
                    player1Position = player1Position + dieNumber;
                    break;
                case GET_SNAKE:
                    System.out.println("you got snake");
                    if (player1Position - dieNumber <= 0)
                        player1Position = 0;
                    else
                        player1Position = player1Position - dieNumber;
                    break;
            }
            if(player1Position >= WINNING_POINT){
                System.out.println("Position of player 1 : " +(player1Position = WINNING_POINT));
                System.out.println("Player 1 won the game !!");
                System.out.println("Congrats player 1!!!");
            }
            System.out.println("Position of Player 1 : " +player1Position);
            System.out.println("------------");
        }
//        if(player1Position == WINNING_POINT){
//            System.out.println("Player 1 won the game !!");
//            System.out.println("Congrats player 1!!!");
//        }
    }
}
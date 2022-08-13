package com.intellijide.snakeandladder;

import java.util.Scanner;

public class SnakeAndLadder {
    static int player1Position = 0;
    public static int rollDie(){
        System.out.println("Please roll a die");
        int dieNumber = (int)(Math.random() * 10 % 6) + 1;
        System.out.println("You get : " +dieNumber);
        return dieNumber;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        System.out.println("--------------------------------");
//        SnakeAndLadder snakenladder = new SnakeAndLadder();
        rollDie();

    }
}

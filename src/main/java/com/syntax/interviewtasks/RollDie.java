package com.syntax.interviewtasks;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        int start = 0;
        int roll = 0;
        int end = 0;

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            roll = random.nextInt(6) + 1;
            if (start + roll >= 40) {
                end = (start + roll) - 40;
            } else {
                end = start + roll;
            }
            System.out.println("start=" + start + ", roll=" + roll + ", end=" + end);
            start = end;
        }
        int start1 = 0;
        int end1 = 0;
        for (int i = 0; i < 30; i++) {
            Random random1 = new Random();
            int roll1 = 1 + random.nextInt(6);
            start1 %= 40;
            end1 = start1 + roll1;
            end1 %= 40;

            System.out.print("start=" + start1);
            System.out.print(" roll=" + roll1);
            System.out.print(" end=" + end1);

            start1 = end1;
            System.out.println();
        }
    }

}

//Let's create a game where we roll a die, and move a player around a game board.
//The board has 40 spaces, arranged in a circle
//
//The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
//- roll the die (each die has a random value, 1-6)
//- print player start position, die value, and ending position
//
//sample output:
//
//    //     start=0, roll=3, end=3
//    //     start=3, roll=2, end=5
//    //     ...
////     start=38, roll=6, end=4
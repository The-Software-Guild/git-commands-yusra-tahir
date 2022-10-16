/**
 *
 * @author Yusra
 * email:yusra-tahir@hotmail.co.uk
 * date: 16-10-2022
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int N = 2;
        int i;

        int chosenNo = random.nextInt(-101, 101);

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");

        for (i = 0; i < N; i++) {

            System.out.println("Guess the number:");

            int userGuess = sc.nextInt();
            System.out.print("\n");

            if (chosenNo == userGuess) {
                System.out.println("Wow, nice guess! That was it! \n ");
                break;
            } else if (chosenNo > userGuess && i != N - 1) {
                System.out.println("Your guess: " + userGuess + "\n");
                System.out.println("Ha, nice try - too high! Try again!");
            } else if (chosenNo < userGuess && i != N - 1) {
                System.out.println("Your guess: " + userGuess + "\n");
                System.out.println("Ha, nice try - too low! Try again!");
            }
        }

        if (i == N) {
            System.out.println("You chose wrong again! ");
            System.out.println("The number was " + chosenNo);
        }
    }

}

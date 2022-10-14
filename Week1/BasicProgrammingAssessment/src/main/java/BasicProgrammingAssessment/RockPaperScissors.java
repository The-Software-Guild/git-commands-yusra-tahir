/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 13-10-2022
 */
package BasicProgrammingAssessment;
//
//import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0;
        int compWins = 0;
        int itsATie = 0;

        while (true) {
            System.out.println("Welcome to Rock Paper Scisscors! \n ");

            System.out.println("How many rounds would you like to play? (1 - 10): ");
            int numberOfRounds = userInput.nextInt();

            if (numberOfRounds < 1 || numberOfRounds > 10) {
                System.out.print("Pick a number between 1 and 10!");
                System.exit(0);
            } else {
                for (int i = 0; i < numberOfRounds; i++) {
                    // USERS MOVE
                    System.out.println("\n 1. ROCK \n 2. PAPER \n 3. SCISSORS \n");

                    int userMove = userInput.nextInt();

                    switch (userMove) {
                        case 1:
                            System.out.println("\n You Chose: ROCK");
                            break;
                        case 2:
                            System.out.println("\n You Chose: PAPER");
                            break;
                        case 3:
                            System.out.println("\n You Chose: SCISSORS");
                            break;
                    }

                    if (userMove != 1 && userMove != 2 && userMove != 3) {
                        System.out.println("Your move is not valid! \n");
                        System.out.println("Computer WINS!");
                        System.exit(0);
                    }

                    // COMPUTERS MOVE
                    int compMove = random.nextInt(3) + 1;
                    switch (compMove) {
                        case 1:
                            System.out.println(" \n Computer Move: ROCK");
                            break;
                        case 2:
                            System.out.println("\n Computer Move: PAPER");
                            break;
                        case 3:
                            System.out.println("\n Computer Move: SCISSORS");
                            break;
                    }

                    // GAME LOGIC
                    if (userMove == compMove) {
                        itsATie++;
                    }
                    if (userMove == 1 && compMove == 2) {
                        compWins++;
                    }
                    if (userMove == 1 && compMove == 3) {
                        userWins++;
                    }
                    if (compMove == 1 && userMove == 2) {
                        userWins++;
                    }
                    if (compMove == 1 && userMove == 3) {
                        compWins++;
                    }

                }
                // GAME STATS
                System.out.println(" Number of Ties: " + itsATie);
                System.out.println(" Number of User Wins: " + userWins);
                System.out.println(" Number of Computer Wins: " + compWins + "\n");

                // RESULT OF THE GAME 
                if ((userWins > compWins) && (userWins >= itsATie)) {
                    System.out.println(" \n USER WINS!");

                }
                if ((compWins > userWins) && (compWins >= itsATie)) {
                    System.out.println("\n COMPUTER WINS!");
                }
                if ((itsATie > userWins) && (itsATie > compWins)) {
                    System.out.println("\n ITS A TIE!");
                }

                System.out.println(" \n Would you like to play another round? \n 1. Yes \n 2. No: \n ");

                int continueGame = userInput.nextInt();
                if (continueGame == 1) {
                } else {
                    System.out.print(" \n Thanks for playing!");
                    System.exit(0);
                }

            }
        }

    }

}

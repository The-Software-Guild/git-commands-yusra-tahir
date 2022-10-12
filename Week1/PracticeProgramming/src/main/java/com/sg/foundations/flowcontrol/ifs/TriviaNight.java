/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {

    public static void main(String[] arg) {
        // Declaring variables and Scanner
        int ans_1;
        int ans_2;
        int ans_3;
        int counter = 0;

        String stringAns_1;
        String stringAns_2;
        String stringAns_3;

        Scanner myScanner = new Scanner(System.in);

        //Game in console
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");

        System.out.println("FIRST QUESTION!");
        System.out.println("In the TV show New Girl, which actress plays Jessica Day?");
        System.out.println("1. Zooey Deschanel");
        System.out.println("2. Kaley Cuoco");
        System.out.println("3. Jennifer Aniston");
        System.out.println("4. Alyson Hannigan");

        stringAns_1 = myScanner.nextLine();
        ans_1 = Integer.parseInt(stringAns_1);

        System.out.println("Your answer: " + ans_1);

        System.out.println("SECOND QUESTION!");
        System.out.println("Which country is the footballer Cristiano Ronaldo from?");
        System.out.println("1. Spain");
        System.out.println("2. Brazil");
        System.out.println("3. Uruguay");
        System.out.println("4. Portugal");

        stringAns_2 = myScanner.nextLine();
        ans_2 = Integer.parseInt(stringAns_2);

        System.out.println("Your answer: " + ans_2);
        System.out.println("LAST QUESTION!");
        System.out.println("Who is the CEO of Amazon??");
        System.out.println("1. Elon Musk");
        System.out.println("2. Tim Cook");
        System.out.println("3. Mark Zuckerberg");
        System.out.println("4. Jeff Bezos");

        stringAns_3 = myScanner.nextLine();
        ans_3 = Integer.parseInt(stringAns_3);
        System.out.println("Your answer: " + ans_3);

        if (ans_1 == 1) {
            counter++;
        }
        if (ans_2 == 4) {
            counter++;
        }
        if (ans_3 == 4) {
            counter++;
        }

        switch (counter) {
            case 3:
                System.out.println("Well Done - you got " + counter + " correct!");
                break;
            case 2:
                System.out.println("Good try - you got " + counter + " correct!");
                break;
            case 1:
                System.out.println("You did your best - you got " + counter + " correct!");
                break;
            default:
                System.out.println("Do better - you got " + counter + " correct!");
                break;
        }
    }
}

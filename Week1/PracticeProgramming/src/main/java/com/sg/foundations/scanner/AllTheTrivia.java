/**
 *
 * @author Yusra
 * email:yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] arg) {

        String answer_1, answer_2, answer_3, answer_4;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        answer_1 = inputReader.nextLine();

        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        answer_2 = inputReader.nextLine();

        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        answer_3 = inputReader.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere?");
        answer_4 = inputReader.nextLine();

        System.out.println("I didn't know that the largest ever volcano is " + answer_4 + "!");
        System.out.println(answer_1 + " is the only planet that rotates clockwise!");
        System.out.println(answer_3 + " is the most abundant element in the atmosphere!");
        System.out.println("Wow, 1024 GB is a " + answer_2 + "!");
    }

}

/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {

    public static void main(String[] arg) {

        double answer_1;
        int answer_2;
        int answer_3;

        String answer1, answer2, answer3;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many miles they can run?");
        answer1 = inputReader.nextLine();
        answer_1 = Double.parseDouble(answer1);

        System.out.println("How many hot dogs can you eat?");
        answer2 = inputReader.nextLine();
        answer_2 = Integer.parseInt(answer2);

        System.out.println("How many languages do you know?");
        answer3 = inputReader.nextLine();
        answer_3 = Integer.parseInt(answer3);

        System.out.println("I can run more miles than you approximately, " + answer_1 * 2 + 1 + "!");
        System.out.println("I can eat more hot dogs than you approximately, " + answer_2 * 2 + 1 + "!");
        System.out.println("I am smarter than you which is why I know " + answer_3 * 2 + 1 + " languages!");
    }

}

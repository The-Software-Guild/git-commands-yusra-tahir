/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Yusra
 */
public class BiggerBetterAdder {

    public static void main(String[] arg) {
        double answer_1;
        int answer_2;
        int answer_3;
        int answer_4;
        int answer_5;

        String answer1, answer2, answer3, answer4, answer5;

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

        System.out.println("What number would you like to multiply by?");
        answer4 = inputReader.nextLine();
        answer_4 = Integer.parseInt(answer4);

        System.out.println("What number would you like to add together?");
        answer5 = inputReader.nextLine();
        answer_5 = Integer.parseInt(answer5);

        System.out.println("I can run more miles than you approximately, " + answer_1 * answer_4 + answer_5 + "!");
        System.out.println("I can eat more hot dogs than you approximately, " + answer_2 * answer_4 + answer_5 + "!");
        System.out.println("I am smarter than you which is why I know " + answer_3 * answer_4 + answer_5 + " languages!");

    }
}

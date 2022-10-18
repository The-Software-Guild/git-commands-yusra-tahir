/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 18-10-2022
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life?");
        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }
        System.out.println("TRADITION!!");
    }
}

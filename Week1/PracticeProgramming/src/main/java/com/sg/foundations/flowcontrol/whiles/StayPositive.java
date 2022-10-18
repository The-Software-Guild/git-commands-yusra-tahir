/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 18-10-2022
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to start with?");
        int startingValue = sc.nextInt();

        if (startingValue > 0) {

            while (startingValue >= 0) {
                if (startingValue % 10 == 0) {
                    System.out.print("\n");
                }
                System.out.print(startingValue + " ");
                startingValue--;
            }

            System.out.println("\n Blast Off!");

        } else {
            System.out.println("Choose a positive number!");
            System.exit(0);
        }
    }
}

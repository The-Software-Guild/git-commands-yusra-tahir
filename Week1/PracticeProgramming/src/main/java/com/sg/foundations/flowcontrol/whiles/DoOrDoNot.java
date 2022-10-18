/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 18-10-2022
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        do {
            iDidIt = true;
            break;
        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }

        // tell it to do it: "I did it!" because doIt is true and IDidIt is true so if statement evaluates to true
        // tell it not to do it: "I know you said not to ... but I totally did anyways." because doIt is false and IDidIt is true so if is false
//        METHOD WITH WHILE LOOP
//        boolean iDidIt = true;
//
//        while (doIt && iDidIt) {
//            System.out.println("I did it!");
//            break;
//        }
//
//        while (!doIt && iDidIt) {
//            System.out.println("I know you said not to ... but I totally did anyways.");
//            break;
//          }
    
}
}

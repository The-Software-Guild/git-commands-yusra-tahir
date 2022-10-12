/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] arg) {
        Scanner inputReader = new Scanner(System.in);

        String yourName, yourFavouriteColour, yourFavouriteFood, yourNumber;

        System.out.println("Hello there! ");
        System.out.println("What is your name? ");
        yourName = inputReader.nextLine();

        System.out.println("Hello, " + yourName + "!" + " I'm Yusra.");
        System.out.println("What is your favourite colour? ");
        yourFavouriteColour = inputReader.nextLine();

        System.out.println(yourFavouriteColour + " is my second favourite colour! " + " Lilac is mine!");
        System.out.println("What is your favourite food? ");
        yourFavouriteFood = inputReader.nextLine();

        System.out.println("Huh, " + yourFavouriteFood + "?" + " Mine's Korean.");
        System.out.println("What is your lucky number? ");
        yourNumber = inputReader.nextLine();

        System.out.println("Wow, it makes sense that " + yourNumber + " is your lucky number!" + " I don't have one.");

    }

}

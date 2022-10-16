/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 15-10-2022
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(6) + 1;

    System.out.println("TIME TO ROOOOOOLL THE DICE!");
    System.out.println("I rolled a " + rollResult);

    if (rollResult == 1) {
        System.out.println("You rolled a critical failure!");
    }
    }
}

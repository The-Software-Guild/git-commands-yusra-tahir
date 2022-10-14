/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 13-10-2022
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];

        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";

        System.out.println("The nut has been hidden ...");

        for (int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i] != null) {
                System.out.println("Found it! It's in spot number: " + i);
            }
        }

    }
}

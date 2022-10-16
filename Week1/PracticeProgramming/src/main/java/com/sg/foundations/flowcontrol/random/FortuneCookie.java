/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 15-10-2022
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {

        Random randomise = new Random();

        int quotes = randomise.nextInt(11);

        switch (quotes) {
            case 0:
                System.out.println("Your Geek Fortune: Those aren't the droids you're looking for.");
                break;
            case 1:
                System.out.println("Your Geek Fortune: Never go in against a Sicilian when death is on the line!");
                break;
            case 2:
                System.out.println("Your Geek Fortune: Goonies never say die.");
                break;
            case 3:
                System.out.println("Your Geek Fortune: With great power, there must also come — great responsibility.");
                break;
            case 4:
                System.out.println("Your Geek Fortune: Never argue with the data.");
                break;
            case 5:
                System.out.println("Your Geek Fortune: Try not. Do, or do not. There is no try.");
                break;
            case 6:
                System.out.println("Your Geek Fortune: You are a leaf on the wind, watch how you soar.");
                break;
            case 7:
                System.out.println("Your Geek Fortune: Do absolutely nothing, and it will be everything that you thought it could be.");
                break;
            case 8:
                System.out.println("Your Geek Fortune: Kneel before Zod.");
                break;
            case 9:
                System.out.println("Your Geek Fortune: Make it so.");
                break;

        }
    }

}

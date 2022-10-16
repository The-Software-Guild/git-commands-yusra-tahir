/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * data: 15-10-2022
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {
        Random randomise = new Random();

        System.out.println("Random can make integers: " + randomise.nextInt());

        System.out.println("Or a double: " + randomise.nextDouble());

        System.out.println("Or even a boolean: " + randomise.nextBoolean());

        int num = randomise.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomise.nextInt(101) + ", ");
        System.out.print(randomise.nextInt(101) + ", ");
        System.out.print(randomise.nextInt(101) + ", ");
        System.out.print(randomise.nextInt(101) + ", ");
        System.out.print(randomise.nextInt(101) + ", ");
        System.out.println(randomise.nextInt(101));

        // generates a random number and attaches 50 to the end
        System.out.println("\n " + randomise.nextInt(10) + 50);

    }
}

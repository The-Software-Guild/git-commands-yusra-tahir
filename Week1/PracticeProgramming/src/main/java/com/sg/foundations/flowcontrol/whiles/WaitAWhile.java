/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 16-10-2022
 */
package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {

    public static void main(String[] args) {
        int timeNow = 5;
        int bedTime = 11;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++;
        }

        System.out.println("Oh. It's " + timeNow + " o'clock");
        System.out.println("Guess I should go to bed ...");

    }

}

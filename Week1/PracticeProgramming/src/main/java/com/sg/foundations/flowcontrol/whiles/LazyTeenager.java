/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * 18-10-2022
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {

        Random random = new Random();
        int probability = 50;
        int percent1 = random.nextInt(40);
        boolean cleanRoom;

        int toldToClean = 0;

        do {
            System.out.println("Clean your room!");
            toldToClean++;
            percent1 = percent1 + 10;
            if (toldToClean < 7 && percent1 >= probability) {
                cleanRoom = true;
            } else {
                cleanRoom = false;
            }
        } while (toldToClean < 7 && cleanRoom == false);

        if (cleanRoom == false && toldToClean == 7) {
            System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX! ");
        } else if (cleanRoom == true && toldToClean < 7) {
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
        }

    }

}

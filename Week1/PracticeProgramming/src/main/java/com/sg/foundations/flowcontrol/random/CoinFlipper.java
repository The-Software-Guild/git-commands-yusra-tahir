/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Yusra
 */
public class CoinFlipper {

    public static void main(String[] args) {

        Random coinFlipper = new Random();

        int headsOrTails = coinFlipper.nextInt(2);
        System.out.println("Ready, Set, Flip....!!");

        switch (headsOrTails) {
            case 0:
                System.out.println("You got HEADS!");
            case 1:
                System.out.println("You got TAILS!");
        }

    }

}

/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10=2022
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        
        float yearBorn;
        String stringBornYear;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What year were you born?");
        stringBornYear = myScanner.nextLine();
        
        yearBorn = Float.parseFloat(stringBornYear);
       
        if(yearBorn < 2005) {
           System.out.println("Pixar's 'Up' came out over a decade ago!");
        }
        if (yearBorn < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago!");
        } 
        if(yearBorn < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        } 
        if(yearBorn < 1975) {
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if(yearBorn < 1965) {
            System.out.println("the MASH TV series has been around for almost half a century!");
        }
        
    }
    
}

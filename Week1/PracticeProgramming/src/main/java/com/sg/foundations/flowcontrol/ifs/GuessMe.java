/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        
        // Declare variables
        int myInteger = 25;
        float userInteger;
        String stringUserInput;
        
        // Declare Scanner 
        Scanner myScanner = new Scanner(System.in);
        
        // User input, store & parseint to float
        System.out.println("Pick a number please:");
        stringUserInput = myScanner.nextLine();
        
        userInteger = Float.parseFloat(stringUserInput);
        
        if(userInteger == myInteger) {
            System.out.println("Wow, nice guess! That was it!");
        } else if(userInteger < myInteger) {
            System.out.println("Ha, nice try - too low! I chose: " + myInteger);
            
        } else if(userInteger > myInteger){
            System.out.println("Too bad, way too high. I chose: " + myInteger);
            
        } else {
            System.out.println("Number not recognised, please try again!");
        }
        
    }
}

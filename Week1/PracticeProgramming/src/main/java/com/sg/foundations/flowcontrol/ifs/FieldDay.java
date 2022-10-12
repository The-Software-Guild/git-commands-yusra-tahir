/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Yusra email: yusra-tahir@hotmail.co.uk date: 12-10-2022
 */
public class FieldDay {

    public static String capitalise(String str) {
        String words[] = str.split("\\s");
        String capitaliseWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitaliseWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitaliseWord.trim();
    }

    public static void main(String[] arg) {
        String name_1 = "Baggins";
        String name_2 = "Dresden";
        String name_3 = "Howl";
        String name_4 = "Potter";
        String name_5 = "Vimes";
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your last name?");
        String lastName = capitalise(userInput.nextLine());

        if (lastName.compareTo(name_1) < 0) {
            System.out.println("Red Dragons");
        } else if (lastName.compareTo(name_1) > 0 && lastName.compareTo(name_2) < 0) {
            System.out.println("Dark Wizards");
        } else if (lastName.compareTo(name_2) > 0 && lastName.compareTo(name_3) < 0) {
            System.out.println("Moving Castles");

        } else if (lastName.compareTo(name_3) > 0 && lastName.compareTo(name_4) < 0) {
            System.out.println("Golden Snitches");
        } else if (lastName.compareTo(name_4) > 0 && lastName.compareTo(name_5) < 0) {
              System.out.println("Night Guards");
        } else {
            System.out.println("Black Holes");
        }

    }
}

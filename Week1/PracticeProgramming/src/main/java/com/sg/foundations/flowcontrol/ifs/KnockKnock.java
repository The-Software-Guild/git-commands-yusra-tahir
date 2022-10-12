/**
 *
 * @author Yusra email: yusra-tahir@hotmail.co.uk date: 12-10-2022
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {

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

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = capitalise(inputReader.nextLine());

        if (nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}

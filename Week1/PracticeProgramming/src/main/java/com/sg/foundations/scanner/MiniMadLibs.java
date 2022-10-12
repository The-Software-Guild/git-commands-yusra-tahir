/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] arg) {
        String noun, adjective, anotherNoun, anotherAdjective, pluralNoun, pluralNoun_2,
                pluralNoun_3, verbPresentTense, sameVerbPastTense;
        int number;

        String stringNumber;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Let's plat MAD LIBS");

        System.out.println("I need a noun:");
        noun = inputReader.nextLine();

        System.out.println("I need an adjective:");
        adjective = inputReader.nextLine();

        System.out.println("I need another noun:");
        anotherNoun = inputReader.nextLine();

        System.out.println("I need a number:");
        stringNumber = inputReader.nextLine();
        number = Integer.parseInt(stringNumber);

        System.out.println("I need another adjective:");
        anotherAdjective = inputReader.nextLine();

        System.out.println("I need a plural noun:");
        pluralNoun = inputReader.nextLine();

        System.out.println("I need another plural noun:");
        pluralNoun_2 = inputReader.nextLine();

        System.out.println("And another plural noun:");
        pluralNoun_3 = inputReader.nextLine();

        System.out.println("I need a verb in present tense:");
        verbPresentTense = inputReader.nextLine();

        System.out.println("I need the verb above in the past tense:");
        sameVerbPastTense = inputReader.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");

        System.out.println(noun + ": the " + adjective + " frontier. These are the voyages of the starship " + anotherNoun + ". Its " + number + "-year mission: to explore strange " + anotherAdjective + " " + pluralNoun + ", to seek out " + anotherAdjective + " " + pluralNoun_2 + " and " + anotherAdjective + pluralNoun_3 + ", to boldly " + verbPresentTense + " where no one has " + sameVerbPastTense + " before.");

    }

}

/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }

            if (action.equals("stick your hand in")) {
                System.out.println("You feel something wet and gooey.");
                System.out.println("It moves against your hand");
                System.out.print("remove your hand or grab the moving item? ");
                action = userInput.nextLine();

                if (action.equals("grab the moving item")) {
                    System.out.println("It is a hurt snake and it panics");
                    System.out.println("You've been bitten by a deadly snake!");
                } else if (action.equals("remove your hand")) {
                    System.out.println("You notice the blood on your hand and scream");
                    System.out.println("Probably saved your life with that decision!");
                }

            }

        } else if (action.equals("go to the house")) {
            System.out.println("You notice the bike in front of the house ");
            System.out.println("There are footsteps coming from inside");
            System.out.println("As you get to the front door, it creaks open");
            System.out.println("Step inside the house or grab the bike and ride away");
            action = userInput.nextLine();

            if (action.equals("step inside the house")) {
                System.out.println("A large man charges at you and throws you out");
                System.out.println("That will teach you to not trespass");
            } else if (action.equals("grab the bike and ride away")) {
                System.out.println("As you ride away you notice a man staring at you from the patio");
                System.out.println("Smart decision.");
            }

        }
    }
}

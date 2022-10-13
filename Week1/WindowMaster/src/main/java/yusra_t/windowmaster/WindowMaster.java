/**
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package yusra_t.windowmaster;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        // Declare variables that will be needed

        float height, width, windowCost, trimCost, windowNumber, areaOfWindow, perimeterOfWindow, cost;

        // Declare and initilaise the Scanner
        Scanner sc = new Scanner(System.in);

        // User input 
        height = readValue("Please enter window height:");
        width = readValue("Please eneter window width:");
        windowCost = readValue("Please enter cost of  window:");
        trimCost = readValue("Please enter cose of trim:");
        windowNumber = readValue("Please enter the number of windows:");

        // Calculate the area of the window              
        areaOfWindow = height * width;

        // Calculate the perimeter of the window   
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost 
        cost = (windowNumber * (windowCost * areaOfWindow) + (trimCost * perimeterOfWindow));

        // Display the results to the user
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }

    public static float readValue(String prompt) {
        // Declaring a scanner variable 
        Scanner sc = new Scanner(System.in);

        // Print question to console for user input
        System.out.println(prompt);

        // Read the input given by the user
        String input = sc.nextLine();

        // Convert the string received from user to a float
        float floatVal = Float.parseFloat(input);
        return floatVal;
    }
}

/**
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 11-10-2022
 */

package yusra_t.windowmaster;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        // Declare variables that will be needed
        
        float height;
        float width;
        float windowCost;
        float trimCost;
        float windowNumber;
        
        float areaOfWindow;
        float perimeterOfWindow;
        float cost;
        
        String stringHeight;
        String stringWidth;
        String costOfWindow;
        String costOfTrim;
        String numberOfWindows;
        
        // Declare and initilaise the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // User input 
        System.out.println("Please enter the number of windows:");
        numberOfWindows = myScanner.nextLine();
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please eneter window width:");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter cost of  window:");
        costOfWindow = myScanner.nextLine();
        System.out.println("Please enter cose of trim:");
        costOfTrim = myScanner.nextLine();
        
        // Convert String values of height and width to float values 
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windowCost = Float.parseFloat(costOfWindow);
        trimCost = Float.parseFloat(costOfTrim);
        windowNumber = Float.parseFloat(numberOfWindows);
        
        // Calculate the area of the window              
        areaOfWindow = height * width;
        
        // Calculate the perimeter of the window   
        perimeterOfWindow = 2 * (height + width);
        
        // Calculate total cost 
        cost = (windowNumber * (windowCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        
        // Display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }
}

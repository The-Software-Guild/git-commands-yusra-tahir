/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 13-10-2022
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

public class SimpleCombination {

    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        int firstLength = firstHalf.length;
        int secondLength = secondHalf.length;

        int wholeArray = firstLength + secondLength;

        int[] newArray = new int[wholeArray];

        System.arraycopy(firstHalf, 0, newArray, 0, firstLength);
        System.arraycopy(secondHalf, 0, newArray, firstLength, secondLength);

        // Combining code should go here!
        System.out.println("All together now!");
        System.out.println(Arrays.toString(newArray));
    }

}

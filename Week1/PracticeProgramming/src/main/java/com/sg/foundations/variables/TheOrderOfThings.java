/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.variables;

public class TheOrderOfThings {

    public static void main(String[] arg) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(noun + " are " + opinion + ", " + size + ". They are " + age + ", are shaped " + shape
                + ", with a " + color + " tint. The Dragons come from " + origin + ", which is known well for it's " + material + ", which is very useful and " + purpose + " in construction.");
    }

}

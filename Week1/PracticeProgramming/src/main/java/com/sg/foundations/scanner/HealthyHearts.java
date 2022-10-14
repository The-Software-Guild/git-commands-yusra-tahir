/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package BasicProgrammingAssessment;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] arg) {
        int answer_1;

        String answer1;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your age?");
        answer1 = inputReader.nextLine();
        answer_1 = Integer.parseInt(answer1);

        System.out.println("Your maximum heart rate should be " + (220 - answer_1) + " beats per minute.");
        System.out.println("Your target HR Zone is " + (220 - answer_1) * 0.5 + " - " + (220 - answer_1) * 0.85 + " beats per minute.");
    }

}

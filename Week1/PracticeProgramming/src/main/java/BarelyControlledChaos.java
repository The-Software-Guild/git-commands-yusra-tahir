
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Yusra email: yusra-tahir@hotmail.co.uk date: 13-10-2022
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {
        String color = randomColour(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColour(); // call color method again here
        int weight = randomNumber(5, 200); // call number method, with a range between 5 - 200
        int distance = randomNumber(10, 20); // call number method, with a range between 10 - 20
        int number = randomNumber(10000, 20000); // call number method, with a range between 10000 - 20000
        int time = randomNumber(2, 6); // call number method, with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, let me tell you!");
    }

    public static String randomColour() {
        Random randomiser = new Random();

        int colours = randomiser.nextInt(5);

        switch (colours) {
            case 0:
                return "red";
            case 1:
                return "orange";
            case 2:
                return "pink";
            case 3:
                return "blue";
            case 4:
                return "purple";
            default:
                return "green";

        }
    }

    public static String randomAnimal() {
        Random randomiser = new Random();

        int animals = randomiser.nextInt(5);

        switch (animals) {
            case 0:
                return "dog";
            case 1:
                return "cat";
            case 2:
                return "llama";
            case 3:
                return "horse";
            case 4:
                return "zebra";
            default:
                return "lion";

        }
    }

    public static int randomNumber(int min, int max) {
        Random randomiser = new Random();

        int numbers = randomiser.nextInt(min, max);
        return numbers;
    }
}

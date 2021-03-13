import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 20);
        System.out.println(rand);
        System.out.println("Please enter a number between 0 - 20. ");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                if (sc.nextInt() == rand) {
                    System.out.println("You guessed correctly! Goodbye.");
                    break;
                } else {
                    System.out.println("Incorrect. Guess again.");
                    continue;
                }
            }
            System.out.println("Not an integer. Enter a whole number, please.");
            sc.next();
        }
    }
}  
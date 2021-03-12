import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 20);
        System.out.println("I'm thinking of a number between 0-100. Hint, it's " + num);
        while (sc.hasNext()) {
            if (sc.nextInt() == num) {
                break;
            }
        }
    }
}  
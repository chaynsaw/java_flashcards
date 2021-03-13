import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 20);
        System.out.println(rand);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Enter a whole number");
        }
    }
}  
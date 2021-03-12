import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameChooser gameChooser = new GameChooser();
        gameChooser.addGame(new NumberGuesser());
        gameChooser.printAllGames();
    }
}  
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("/Users/chaynorhsiao/Downloads/Sessions 1-2.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  {
            System.out.println(" // ");
            System.out.print(sc.next());
        }
        sc.close();  //closes the scanner
    }
}  
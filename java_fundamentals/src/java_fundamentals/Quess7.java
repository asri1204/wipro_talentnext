package java_fundamentals;
import java.util.Scanner;

public class Quess7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two characters
        System.out.print("Enter first character: ");
        char ch1 = sc.next().charAt(0);

        System.out.print("Enter second character: ");
        char ch2 = sc.next().charAt(0);

        // Display in alphabetical order
        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }

        sc.close();
    }
}

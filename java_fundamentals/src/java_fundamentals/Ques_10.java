package java_fundamentals;

import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("i/p: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.println("o/p: " + ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("o/p: " + ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("o/p: Invalid input");
        }

        sc.close();
    }
}
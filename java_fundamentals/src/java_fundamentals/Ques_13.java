package java_fundamentals;

import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing numbers from 1 to 10 with tab space:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        sc.close();
    }
}

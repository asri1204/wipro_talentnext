package java_fundamentals;

import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");

        if (sc.hasNextInt()) {
            int month = sc.nextInt();

            String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };

            if (month >= 1 && month <= 12) {
                System.out.println("Output: " + months[month - 1]);
            } else {
                System.out.println("Output: Invalid month");
            }
        } else {
            System.out.println("Output: Please enter the month in numbers");
        }

        sc.close();
    }
}

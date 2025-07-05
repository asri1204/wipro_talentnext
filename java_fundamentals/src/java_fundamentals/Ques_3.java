package java_fundamentals;

import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter two numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1 + num2 ;
			System.out.println("The sum of" +num1 + " and " + num2 + " is " + sum);
		}

	}

}

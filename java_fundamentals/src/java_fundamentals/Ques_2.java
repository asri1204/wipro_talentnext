package java_fundamentals;

import java.util.Scanner;

public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Welcome " + name);
		}

	}

}

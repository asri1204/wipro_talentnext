package java_fundamentals;

import java.util.Scanner;

public class Ques_4 {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("Positive number");
			}
				else if (num < 0){
					System.out.println("Negative number");
				}
					else {
						System.out.println("zero");
						
					}
		    	
		    }
			}
}

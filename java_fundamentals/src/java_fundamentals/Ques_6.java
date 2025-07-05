package java_fundamentals;

import java.util.Scanner;

public class Ques_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if(num %2 == 0) {
				System.out.println("even number");
			}else {
				System.out.println("odd number");
			}
		}

	}

}

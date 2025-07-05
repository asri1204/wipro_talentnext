package java_fundamentals;

import java.util.Scanner;

public class Ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1 % 10 == n2 % 10) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
			
		}

	}

}

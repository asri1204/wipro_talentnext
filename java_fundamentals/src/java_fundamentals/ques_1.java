package java_fundamentals;
import java.util.Scanner;

public class ques_1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter the company:");
			String company = sc.next();
			System.out.println("enter the location:");
			String location = sc.next();
			System.out.println(company + " Technologies " + location);
		}
	}
}
			
		
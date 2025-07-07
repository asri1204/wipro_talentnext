package java_fundamentals;
import java.util.Scanner;

public class Asciicharques4 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			System.out.println("Enter the values of an array");
			int arr[] = new int[size];
			for(int i = 0; i < size ; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("characters of the values");
			for(int i = 0; i < size; i++) {
				System.out.println((char) arr[i]);
			}
			
			
			
		}

	}

}

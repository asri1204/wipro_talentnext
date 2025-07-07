package java_fundamentals;
import java.util.Scanner;

public class Maxminques_2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of an array");
			int size = sc. nextInt();
			System.out.println("Enter the elements of an array");
			int arr[] = new int[size];
			for(int i = 0 ; i < size ; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("the elements are:");
			for(int i = 0 ; i < size ; i++) {
			System.out.println(arr[i]);
			}
			
			int max = arr[0]; int min = arr[0];
			for(int i = 0; i < size ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			}
			System.out.println("the max ele");
			System.out.println(max);	
			System.out.println("the min ele");
			System.out.println(min);
	}
}
}

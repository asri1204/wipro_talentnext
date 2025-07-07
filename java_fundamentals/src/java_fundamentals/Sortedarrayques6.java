package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;

public class Sortedarrayques6 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of an array");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < size; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("the elements in sorted order are:");
		for( int num : arr) {
			System.out.println(num);
			
		}
		

	}

}
}

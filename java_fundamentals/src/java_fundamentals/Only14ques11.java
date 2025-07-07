package java_fundamentals;
import java.util.Scanner;

public class Only14ques11 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		// TODO Auto-generated method stub
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		System.out.println("enter the array elements:");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++ ) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("printing only 1 and 4");
		boolean only14 = true;
		for(int i = 0; i < size; i++) {
			if(arr[i]!=1 && arr[i] != 4) {
				only14 = false;
			}
		}
				System.out.println(only14);
			}
		}

	}



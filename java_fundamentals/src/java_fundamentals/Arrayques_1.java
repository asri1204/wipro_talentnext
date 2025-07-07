package java_fundamentals;

import java.util.Scanner;

public class Arrayques_1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("enter the elements of an array");
			for(int i = 0; i <size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("elements of an array:");
			for(int i = 0 ; i < size; i++) {
				System.out.println(arr[i]);
			}
			int sum = 0;
			int average;
			for(int i = 0; i < size; i++) {
				 sum = sum + arr[i];
			}
			System.out.println("sum");
			System.out.println(sum);
			System.out.println("average");
		    average = sum / size ;
		    System.out.println(average);
		

	}
	}
}

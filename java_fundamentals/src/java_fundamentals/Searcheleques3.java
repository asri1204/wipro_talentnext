package java_fundamentals;

import java.util.Scanner;

public class Searcheleques3 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of n array:");
			int size = sc .nextInt();
			System.out.println("the elements are:");
			int arr[] = new int[size];
			for(int i = 0 ; i < size ; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i = 0 ; i < size; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Enter the element to be search");
			int key = sc.nextInt();
			int index = -1;
			for(int i = 0; i < size ; i++) {
				if (arr[i] == key) {
					index = i ;
					break;
				}
			}
			System.out.println(index);
		}
	}
}

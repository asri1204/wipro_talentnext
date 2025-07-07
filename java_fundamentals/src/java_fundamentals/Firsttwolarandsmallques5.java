package java_fundamentals;

import java.util.Arrays;

public class Firsttwolarandsmallques5 {

	public static void main(String[] args) {
		int[] arr = {45, 2, 56, 34, 89, 14};
		for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("The sorted array");
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println("the 2 smallest numbers " + arr[0] + " and " + arr[1]);
		System.out.println("the 2 largest numbers " + arr[arr.length-2] + " and " + arr[arr.length-1]);

	}
	}


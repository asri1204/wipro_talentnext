package java_fundamentals;

public class Removeten {

	public static void main(String[] args) {
		
		int arr[] = {1, 10, 10, 2};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int temp[] = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!=10) {
				temp[j++] = arr[i];
			}
		}
		System.out.println("after removing tens in array");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(temp[i]);
		}
	}
}


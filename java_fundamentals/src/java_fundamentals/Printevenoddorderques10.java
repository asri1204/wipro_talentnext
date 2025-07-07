package java_fundamentals;

public class Printevenoddorderques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 1, 4, 5, 6, 9,8};
		System.out.println("Given array");
		for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
		System.out.println("First Even than Odd numbers");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

}
}

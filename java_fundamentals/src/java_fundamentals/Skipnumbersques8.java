package java_fundamentals;

public class Skipnumbersques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 6, 4, 7, 9};
		boolean skip = false;
		int sum = 0; 
		for(int i = 0; i < arr.length; i++) {
		if(arr[i] == 6) {
			skip = true;
		}
		else if(arr[i]==7 && true) {
			skip = false;
		}else if(!skip) {
			sum = sum + arr[i];	
		}
	}
		System.out.println(sum);
}
}

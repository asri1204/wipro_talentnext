package java_fundamentals;

public class Removeduplicatesques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 15, 45, 12, 3, 45, 2};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int temp[] = new int[arr.length];
		int j = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for(int k = 1 ; k < j; k++) {
				if(arr[i] == temp[k]) {
					isDuplicate = true;
					break;		
				}
				
			}
			if (!isDuplicate) {
				temp[j] = arr[i];
				j++;
			}
		}
		System.out.println("array after removing  duplicate elements");
		for(int i = 0 ; i < j; i ++) {
			System.out.print(temp[i] + " ");
			
		}

	}

}

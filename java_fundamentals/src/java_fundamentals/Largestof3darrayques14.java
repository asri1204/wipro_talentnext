package java_fundamentals;
import java.util.Scanner;
public class Largestof3darrayques14 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
					arr[i][j] = sc.nextInt();
				}
			}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		int max = arr[0][0];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if( arr[i][j] > max) {
					max = arr[i][j];
				}
		}
		}
		System.out.println("max element");
		System.out.println(max);
		}
}
}

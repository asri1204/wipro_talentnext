package java_fundamentals;
import java.util.Scanner;
public class Reverseof2darrayques13 {

	public static void main(String[] args) {
		if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
		}
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int arr[][] = new int[2][2];
			System.out.println("enter elements");
			for (int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < 2; i++) {
				for(int j= 0; j < 2; j++ ) {
					System.out.print(arr[i][j] + " ");
					
				}
				System.out.println();
			}
			System.out.println("reverse array");
			for(int i = 1; i >= 0; i--) {
				for(int j = 1; j >=0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	}

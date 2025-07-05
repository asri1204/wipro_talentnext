package java_fundamentals;

public class Ques_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 if (args.length < 2) {
	            System.out.println("Please provide gender and age as command line arguments.");
	            return;
	        }

	        String gender = args[0];
	        int age = Integer.parseInt(args[1]);

	        if (gender.equalsIgnoreCase("Female")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest is 8.2%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest is 9.2%");
	            }
	        } else if (gender.equalsIgnoreCase("Male")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest is 8.4%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest is 10.5%");
	            }
	        } else {
	            System.out.println("Invalid gender.");
	        }
	    }
	}

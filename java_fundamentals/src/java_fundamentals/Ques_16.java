package java_fundamentals;

public class Ques_16{
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num);
            }
        }
    }
}

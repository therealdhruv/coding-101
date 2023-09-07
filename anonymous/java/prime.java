package anonymous.java;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number upto which you want to print the prime numbers : ");
        int input = sc.nextInt();
        sc.close();

        for (int i = 0; i <= input; i++) {
            // if it's prime, print it
            if (isPrime(i)) {
                System.out.print(i + "   ");
            }
        }
        System.out.println("\n");
    }

    // method to check if the number is prime or not
    static boolean isPrime (int num) {
        if (num == 0 || num == 1) return false;
        // since prime numbers start from 2
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

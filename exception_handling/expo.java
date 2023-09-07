package exception_handling;
import static java.lang.Math.pow;

import java.util.Scanner;



public class expo {
    // creating objects of Scanner and MyCalculator
    public static final MyCalculator obj = new MyCalculator();
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        // simple try-catch block to execute the power method in the MyCalculator class
        try {
            System.out.println(obj.power(n,p));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

class MyCalculator {
    public long power (final int n, final int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) pow (n,p);
    }
}

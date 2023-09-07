package recursion;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th fibonacci number is : " + findFibo(n));
        sc.close();
    }

    // fibonachi method using recurssion
    static int findFibo(int n) {
       // base condition
       if (n == 1) {
           return 0;
       } else if (n == 2) {
           return 1;
       }
        return findFibo(n-1) + findFibo(n-2);
    }
}

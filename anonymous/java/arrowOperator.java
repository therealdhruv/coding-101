package anonymous.java;

import java.util.Scanner;

public class arrowOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements you wanna enter : ");
        int a = sc.nextInt();

        while (a --> 0) {   // "a" number of times this program will run
            int i = 1;
            int c = a+i;
            System.out.println("The loop will be executed " + c + " times");
            i++;
        }
        sc.close();
    }
}

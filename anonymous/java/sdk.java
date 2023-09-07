package anonymous.java;

import java.util.Scanner;

public class sdk {
    public static void main(String[] args) {
        System.out.print("Please enter your age : ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // logic
        System.out.println(age >= 18 ? "Yes" : "No");
    }
}
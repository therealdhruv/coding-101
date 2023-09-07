package anonymous.cp;

import java.util.Scanner;


public class inSearchOfEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count = 0;
        while (n-->0) {
            int input = sc.nextInt();
            if (input == 1) {
                count++;
            } 
        }
        if (count != 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        sc.close();
    }
}

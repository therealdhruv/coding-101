package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string that is to be checked for palindromity : ");
        String s = sc.next();
        System.out.println(isPalindrome(s));
        sc.close();
    }

    static boolean isPalindrome (String name) {

        // Checking off the basic conditions
        if (name == null || name.length()==0) {
            return true;
        }

        name = name.toLowerCase();
        for (int i = 0; i <= name.length() / 2; i++) {
            char start = name.charAt(i);
            char end = name.charAt(name.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }





}

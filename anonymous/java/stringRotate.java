package anonymous.java;

import java.util.Scanner;

public class stringRotate {
    public static void main(String[] args) {     
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string : ");
        String name = sc.next();
        System.out.println("Checking for palindrome : " + checkPalindrome(name));
        System.out.println("Checking for rotation : " + checkRotation(name));

        sc.close();
    }


    static boolean checkPalindrome (String name) {
        name = name.toLowerCase();

        // Checking off the basic conditions
        if (name == null || name.length() == 0) {
            return true;
        }

        for (int i = 0; i <= name.length()/2; i++) {
            char start = name.charAt(0);
            char end = name.charAt(name.length()-1-i);
            if (start != end) {
                return false;
            }
        }

        return true;


    }

    
    
    static boolean isPalindrome(String str, int low, int high) {
        return (low >= high) || (str.charAt(low) == str.charAt(high) &&
        isPalindrome(str, low + 1, high - 1));
    }









    static boolean checkRotation (String name) {
  
        
        name = name.toLowerCase();

        // base case
        if (name == null || name.length() == 0) {
            return false;
        }

        int len = name.length();


        // check for all rotations of the given string if it
        // is palindrome or not
        for (int i = 0; i < len; i++)
        {
            // in-place rotate the string by 1 unit
            name = name.substring(1) + name.charAt(0);
 
            // return true if the rotation is a palindrome
            if (isPalindrome(name, 0, len - 1)) {
                return true;
            }
        }
 
        // return false if no rotation is a palindrome
        return false;


          

    }


}

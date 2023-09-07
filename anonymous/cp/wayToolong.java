package anonymous.cp;
// Sample input and output

import java.util.Scanner;

// Input :-

// 4
// word
// localization
// internationalization
// pneumonoultramicroscopicsilicovolcanoconiosis


// Output :-

// word
// l10n
// i18n
// p43s




public class wayToolong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // System.out.print("Please enter the number of times you wanna run this program : ");
        int n = obj.nextInt();
 
        while ( n --> 0 ) {   // n number of time this will run
            // System.out.print("Enter the word : ");
            String word = obj.next();
 
            if (word.length() > 10) {
                // Do the shit
                // Integer wrapper class is used as we need to convert it to string before we print it
                System.out.println(word.charAt(0) + Integer.toString(word.length()-2) + word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }
        }
        obj.close();
    }
}



package anonymous.cp;

import java.util.Scanner;

// Sample input :-
// 3
// 1 1 0
// 1 1 1
// 1 0 0

// Output :-
// 2



// Input :-
// 2
// 1 0 0
// 0 1 1

// Output :-
// 1





public class team {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        int count = 0;

        
        // System.out.print("Please enter the number of inputs : ");
        int input = obj.nextInt();
        
        while (input --> 0) {    // This will take the inputs "input" number of times

            int sum = 0;


            int x = obj.nextInt();
            int y = obj.nextInt();
            int z = obj.nextInt();

 
            
            sum += x+y+z;

            if (sum > 1) {
                count++;
            }

            
        }

        System.out.println(count);
        obj.close();
    }
}

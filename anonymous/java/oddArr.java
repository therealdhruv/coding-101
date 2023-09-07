package anonymous.java;

import java.util.Arrays;
import java.util.Scanner;

// Method to print n number of odd number in an array

public class oddArr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter the number of odd numbers you want inside the array : ");
        int a = obj.nextInt();
        System.out.println(Arrays.toString(printOddArr(a)));    // this should give out [1,3,5,7,9]
        obj.close();
    }
    static int[] printOddArr(int n) {


    int[] result = new int[n];     // This will be our final answer array


    //        result[0] = 1       0 + 1       i + (i+1)
    //        result[1] = 3       1 + 2       i + (i+1)
    //        result[2] = 5       2 + 3       i + (i+1)
    //        result[3] = 7       3 + 4       i + (i+1)
    //        result[4] = 9       4 + 5       i + (i+1)


    // code for inserting odd numbers in the result array
    for (int i = 0; i < n; i++) {
        for (int j = 1; j <= (2*i)+1; j+=2) {
            result[i] = j;
        }
    }
    
    return result;
        
   }
}






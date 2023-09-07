package searching;

import java.util.Scanner;

public class basic_linear_search {
    public static void main (String args[]) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of elements you wanna input : ");
            int num_of_elements = obj.nextInt();
            int[] arr = new int[num_of_elements];

            for (int i=0; i<arr.length ; i++) {
                System.out.print("Please enter the element :");
                int element = obj.nextInt();
                arr[i]=element;
            }
            System.out.print("Please enter the target :");
            int target = obj.nextInt();


            int answer = linearSearch(arr,target);
            System.out.println("\n\n\nIndex of your target will be : " + answer + "\n\n\n");
        }
    }





    // new function for linear search
    static int linearSearch (int a [],int b) {
        if (a.length == 0) {
            return -1;
        }
        // run a 'for' loop for the search
        for (int index = 0; index < a.length; index++) {
            // check for if element = target
            if (a[index] == b) {
                return index;
            }
        }

        return -1 ;
    }


}

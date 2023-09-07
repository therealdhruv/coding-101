package anonymous.cp;
import java.util.*;

import java.util.Scanner;

public class Cwireframe {
    
    // w is the balance
    // x is his salary
    // y is the bank charges
    // to find after z months

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,element;

        
        while (t-->0) {
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                element = sc.nextInt();
                arr[i] = element;
            }
            IntSummaryStatistics v = Arrays.stream(arr).summaryStatistics();
            int min = v.getMin();
            int max = v.getMax();
            System.out.print(min*min + " ");
            System.out.println(max*max);
        }

        sc.close();


    }

}


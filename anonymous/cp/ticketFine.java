package anonymous.cp;

import java.util.Scanner;

public class ticketFine {
    public static void main(String[] args) {
        int t;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int[] arr = new int[t];
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = (b-c) * a;
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }


        sc.close();
    }
}

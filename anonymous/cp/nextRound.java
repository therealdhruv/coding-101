package anonymous.cp;


import java.util.Scanner;


public class nextRound {
    public static void main (String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int count = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        
        for (int j : arr) {     
            if (j >= arr[k-1] && j > 0) {
                count++;
            } else {
                break;
            }
        }

     
        // System.out.println(Arrays.toString(arr));
        System.out.println(count);
        obj.close();

    }
}

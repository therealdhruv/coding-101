package anonymous.cp;
import java.util.Scanner;
public class creds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int[] arr = new int[t];
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr [i] = a*4 + b*2;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        sc.close();
    }
}

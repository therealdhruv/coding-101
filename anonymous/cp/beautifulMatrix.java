package anonymous.cp;

import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;
        
        // Taking in the input from the user
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x = sc.nextInt();      // nextInt() function has to be on the rhs
                if (x==1) {
                    count += Math.abs(i-2);
                    count += Math.abs(j-2);
                }
            }
        }
        
        
        System.out.println(count);


        sc.close();
    }
}

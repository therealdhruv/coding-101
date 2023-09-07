package anonymous.cp;

import java.util.Scanner;


public class stoneOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int a = sc.nextInt();
        String str = sc.next();
        int count = 0;

   
        for (int i = 0; i < (a-1); i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
        }
    
        
        
        System.out.println(count);
        sc.close();
    }
}
    


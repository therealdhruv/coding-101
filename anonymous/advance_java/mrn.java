package anonymous.advance_java;
import java.util.*;
public class mrn {
    public static void main(String[] args) {
        

        Stack <Integer> sc = new Stack<>();

        sc.push(34);
        sc.push(12);
        sc.push(26);
        sc.push(345);
        sc.push(456);
        sc.push(1);
        sc.push(7);

        System.out.println("\nThe stack is : " + sc);

        // lets pop few elements
        sc.pop();
        sc.pop();

        System.out.println("After popping two elements : " + sc + "\n");



    }
}

package anonymous.advance_java;
import java.util.*;
public class stk {

// The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

    public static void main(String[] args) {


        // this will make an implicit stack which can store strings names using the reference variable 'sc'
        Stack <String> sc = new Stack <> ();   
        sc.push("Dhruv");
        sc.push("Tirth");
        sc.push("Riya");
        sc.push("Naman");
        System.out.println("The stack is : " + sc);
        sc.pop();
        System.out.println("\nThe stack after popping would be : \n" + sc);

    }
}

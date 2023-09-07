package anonymous.advance_java;
import java.util.*;
public class arrList {
    public static void main(String[] args) {

        // Creating an ArrayList of String type
        // Type safe ArrayList
        ArrayList<String> sc = new ArrayList<>();
 
        // Adding elements to above object created
        // Custom input elements
        sc.add("Geeks");
        sc.add("for");
        sc.add("Geeks");
        
        
        System.out.println("\n\narrayList before adding a last element : " + sc);
        
        // adding element at index where element is already present
        sc.add(0, "element");


        // in order to add at last : index -> number of elements before adding
        sc.add(4,"Men are men");
 

        System.out.println("arrayList after adding a last element : " + sc + "\n\n");

    }
}

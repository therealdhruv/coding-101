package LinkedList;
import java.util.*;

public class basicsCC {
    public static void main(String[] args) {
        // Creating object of the
        // class linked list
        LinkedList <String> ll = new LinkedList <> ();
 
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        ll.set(0,"O");
 
        System.out.println(ll);
 
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.print("After the removal statements : ");
        System.out.println(ll);
    }
}

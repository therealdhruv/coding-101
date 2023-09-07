package string;

public class comparision {
    public static void main(String[] args) {
        // Comparision of strings
        // 2 methods :-
        // (i) == : This will check if the variable is pointing to the same object AND also if the values are the same or not
        // (ii) <var_1>.equals(<var_2>) : This will check if the value is same or not only and NOT if the variable is pointing to the same object or not

        String x = "dhruv";
        String y = "dhruv";
        String c = x;
        System.out.println(c==y);   // This will also give true
        System.out.println(x==y);   // This will return true coz both a and b are pointing towards the same object which is inside the string pool in the heap
        System.out.println("\n\n");
        String a = new String("dhruv");
        String b = new String("dhruv");
        System.out.println(a==b);  // This will return false coz both a and b are pointing towards different object which are outide the string pool in heap object
        // Use the .equal() function to check just for the value of the string object, even if different objects are made for different variables
        System.out.println(a.equals(b));

    }
}

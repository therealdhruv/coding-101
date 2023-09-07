package anonymous.java;

public class swapWithout {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("\n");
        System.out.println("a is : " + a + " and b is : " + b);
        System.out.println("\n");
        
        // swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("a is : " + a + " and b is : " + b);
        System.out.println("\n");
        
    }
}

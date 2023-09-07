package oops.polymorphism;

// Java program to demonstrate the working of method
// overloading by changing the number of parameters 

public class overLoading {

    void show (int x) {
        System.out.println("Number 1 is : " + x);
    }

    // overloading the 'show' method by changing the number of parameter
    void show (int x, int y) {
        System.out.println("Number 1 is : " + x + " and number 2 is : " + y);
    }

    public static void main(String[] args) {
        overLoading sc = new overLoading();   // now sc in an object which can access all the methods of the overLoading class
        sc.show(40);
        sc.show(12,13);
    }
}

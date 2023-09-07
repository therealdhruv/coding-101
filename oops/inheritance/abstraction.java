package oops.inheritance;

public class abstraction {
    public static void main(String[] args) {
        
        Horse h1 = new Horse();
        h1.walk();

    }
}


abstract class Animal {
    abstract void walk();
}


class Horse extends Animal {
    public void walk () {
        System.out.println("Walks on 4 legs!");
    }
}



class Chicken extends Animal {
    public void walk () {
        System.out.println("Walks on 2 legs!");
    }
}
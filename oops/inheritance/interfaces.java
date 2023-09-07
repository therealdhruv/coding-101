package oops.inheritance;

public class interfaces {
    public static void main(String[] args) {
        Horse sc = new Horse();
        sc.walk();
        sc.veg();
    }
}

interface Animal {
    void walk();
}
interface Herbivores {
    void veg();
}

// single child class and 2 parent class is multiple inheritance and in java we implement is using the 
// concept of interfaces ... it's just like inheritance but instead of extends we use the keyword 
// 'implements'

class Horse implements Animal,Herbivores {
    public void walk() {
        System.out.println("Walks on four legs!");
    }

    public void veg() {
        System.out.println("Herbivores are men!");
    }

} 






package oops.polymorphism;

public class overRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
   
        B objB = new B();
        objB.meth2();

        B test = new B();
        System.out.println(test.dhruv());

    }
}

class A {
    public int dhruv() {
        return 4;
    }
    public void meth2() {
        System.out.println("this is just another method in the class A");
    }
}

class B extends A {

    public void meth3() {
        System.out.println("I am the method 3 of class B");
    }

    @Override   // this is a symbol to represent overriding
    public void meth2() {   // this is method overriding
        System.out.println("this is just another method in the class B");
    }

    @Override
    public int dhruv() {
        return 69;
    }
}







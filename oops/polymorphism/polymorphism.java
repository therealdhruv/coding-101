package oops.polymorphism;


// Polymophism is of two types :-
// (i) Function overloading -- Compiletime Polymophism
// (ii) Function overriding -- Runtime Polymophism




public class polymorphism {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "Dhruv";
        a.age = 18;
        a.printInfo(a.name);
        a.printInfo(a.age);
        a.printInfo(a.name,a.age);
    }
}


class Student {
    String name;
    int age;

    // Method to print the name
    public void printInfo (String name) {
        System.out.println(name);
    }
    // Method to print the age
    public void printInfo (int age) {
        System.out.println(age);
    }
    // Method to print the full info
    public void printInfo (String name, int age) {
        System.out.println("Name is "+name+" and age is "+age);
    }

    // same function name 'printInfo' is used ... this is called function overloading which is compiletime polymorphism

}

package oops;

public class basics {
    public static void main(String[] args) {
        // Make a new student
        Student a = new Student("Dhruv","21BIT0634");  // new keyword will allocate memory in the heap
        Student b = new Student(a);
       // a.printInfo();  // calling this function so that we can print the student info
        b.printInfo();

    }
}
class Student {
    String regNo;
    String name;

    // Method to print the info
    public void printInfo () {
        System.out.print("The name of the student is : ");
        System.out.println(this.name);
        System.out.print("The reg no of the student is : ");
        System.out.println(this.regNo);
    }


    // creating a non parametarized constructor
    Student (String x, String y) {
        this.name = x;
        this.regNo = y;
    }

    // lets make a copy constructor and see how it works
    // copy constructor basically takes in other student and copies the data into the 
    // student that's calling the copy construtcor
    Student (Student x) {   // for example student x is passed in the student constructor
        this.name = x.name;
        this.regNo = x.regNo;
    }
}





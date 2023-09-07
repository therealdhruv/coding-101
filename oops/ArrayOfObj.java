package oops;


public class ArrayOfObj {
    public static void main(String[] args) {

        Student s1 = new Student("Dhruv", 10);
        Student s2 = new Student("Vishnu", 38);
        Student s3 = new Student("Ram", 20);

        // System.out.println("Student 1 details are : " + s1);
        // System.out.println("Student 2 details are : " + s2);


        // lets make an array of students
        Student[] arr = new Student[3];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;


        // printing this array
        for (Student s : arr) {
            System.out.println(s);
        }


        
    }
}



class Student {
    String sname;
    int rollno;


    // constructor
    public Student (String x, int y) {
        this.sname = x;
        this.rollno = y;
    }

    // overriding the toString method to print in the format we want
    @Override
    public String toString() {
        return "Student {Name : " + sname + ", Roll no : " + rollno + "}";
    }




}

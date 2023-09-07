package oops.inheritance;


public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}



class Shape {    // base class or parent class
    String color;
    public void area () {
        System.out.println("this method will display the area");
    }
}


class Triangle extends Shape {   // sub-class or child class
     public void area (int length, int height) {
        System.out.println((1/2)*length*height);
     }
}



class EquilateralTriangle extends Triangle {
    public void area (int length, int height) {
        System.out.println((1/2)*length*height);
    }
}


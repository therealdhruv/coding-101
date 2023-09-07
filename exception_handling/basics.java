package exception_handling;

public class basics {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("This is outside the try-catch block");

        try {

            System.out.println("This is the start of the try block");
            arr[11] = 13;
            System.out.println("This line is after the occurance of the exception");

        } catch (Exception e) {

            System.out.println("This is the start of the catch block");
            System.out.println("We're so sorry dhruv we could not run this due to : ");
            System.out.println(e);
            
        }

        System.out.println("This is outside the try-catch block");

        // in order to avoid the runtime errors ... we use a try catch block



    }
}

package exception_handling;
public class javaExceptionEg {
    public static void main(String[] args) {
        System.out.println("our code starts here ... ");
        // we can use the mechanism of exception handling to avoid runtime errors
        
        try {
            // code that is gonna or raising the exceptoin
            int t = 10/0;
            System.out.println("The value of t is : " + t);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // rest of the code continues from here    
        System.out.println("our code ends here ... ");
    }
}
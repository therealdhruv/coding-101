package recursion;

public class basics101 {
    public static void main(String[] args) {
        // write a method to print a number taken from user
        // print first five users : 1,2,3,4,5
        printNos(1);
    }

    static void printNos (int n) {

        if (n == 5) {
            System.out.println(5);
            return;
        }



        System.out.println(n);
        printNos(n + 1);   // recursion : function that calls itself    (This is called 'tail recursion')
    }

}

package anonymous.java;

public class arraySum {
    public static void main(String[] args) {
        int[] arr = {20,20,3,3,3,3,3};
        System.out.println("The sum of this array would be : " + arrSum(arr));
    }
    static int arrSum(int[] array) {
        int result = 0;
        for (int j : array) {    
            result = result + j;
        }
        return result;
    }
}

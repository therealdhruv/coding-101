package anonymous.java;

public class divisorSum {
    public static void main(String[] args) {
        System.out.println(divisor_sum(6));
    }

    static int divisor_sum (int num) {
        int[] arr = new int[num];
        int e = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                arr[e] = i;
            }
            e++;
        }
        // Now we just need to print the sum of arr
        int result = 0;
        for (int x : arr) {
            result += x;
        }
        return result;
    }

}

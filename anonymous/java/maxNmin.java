package anonymous.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class maxNmin {
    public static void main(String[] args) {
        int[] arr = {23,45,67,89,1000,2134};

        // Find the max and min from the array
        System.out.println("\n\n");
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("\n\n");
        System.out.println("Using the inbuilt methods : ");
        System.out.println("\n");
        IntSummaryStatistics v = Arrays.stream(arr).summaryStatistics();
        System.out.println("Maximum element will be : " + v.getMax());
        System.out.println("Minimum element will be : " + v.getMin());
        System.out.println("\n\n");
        System.out.println("Using my methods : ");
        System.out.println("\n");
        System.out.println("Maximum element will be : " + maxElement(arr));
        System.out.println("Maximum element will be : " + minElement(arr));
        System.out.println("\n\n");
        
    }

    static int maxElement (int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return nums[max];
    }
    
    static int minElement (int[] nums) {
        int min = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
        }
        return nums[min];
    }
}

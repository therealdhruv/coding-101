package searching;

// https://leetcode.com/problems/split-array-largest-sum/

import java.util.stream.IntStream;

public class splitArray {
    public static void main(String[] args) {

        int [] nums = {2,3,1,2,4,3};
        int m = 5 ;
        System.out.println(largestSum(nums,m));

    }


    static int largestSum (int [] nums,int m) {

        int start = largesElement(nums);     // largesElement is a function that I wrote
        int end = IntStream.of(nums).sum();  // IntStream.of(<array name>).sum ==> will give sum of all elements in that array
        // make sure to import java.util.stream.IntStream;

        while (start < end) {
            int mid = start + (end-start)/2;
            int sum = 0;
            int pieces = 1 ;

            for (int i : nums) {
                if (sum + i > mid) {
                    sum = i ;
                    pieces ++ ;
                } else {
                    sum = sum + i ;
                }
            }

            if (pieces > m) {
                start = mid + 1 ;
            } else {
                end = mid ;
            }
        }
        return end ;  // here start == end ;
    }

    static int largesElement (int[] arr) {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }






}

package searching;

// https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.util.Arrays;

public class median {


    public static void main(String[] args) {

        int [] nums1 = {3,4};
        int [] nums2 = {1,2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }


    static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = mergeArray(nums1,nums2);


        int n = mergedArray.length;

        if (n%2==0) {

            double mid = (mergedArray[(n/2)-1]+mergedArray[(n/2)]) / 2.0 ;
            return mid ;
        } else {
            return mergedArray[n/2];
        }
        



    }

    static int[] mergeArray (int[] nums1, int[] nums2) {


        int[] newArray = new int[nums1.length+ nums2.length];
        int position = 0;


        // we'll concatenate two arrays without using the arraycopy function
        for (int element : nums1) {                // using enhanced for loop
            newArray[position] = element;
            position++;
        }
        for (int element : nums2) {
            newArray[position] = element;
            position++;
        }
        Arrays.sort(newArray);
        
        return newArray;

    }

}

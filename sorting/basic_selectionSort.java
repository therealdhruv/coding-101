package sorting;

import java.util.Arrays;


public class basic_selectionSort {
    public static void main(String[] args) {

        int[] nums = {1,-100,0};
        selectionSortIt(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void selectionSortIt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max element and keep swapping it on right side
            int last_index = arr.length-1-i;
            int max_index = getMaxElementIndex (arr, last_index);
            swap(arr,max_index,last_index);
        }
    }



// function to get max index from a given array
     static int getMaxElementIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i ;
            }
        }
        return max;
    }



    // function to swap two elements in an array
    static void swap (int[] arr , int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

}

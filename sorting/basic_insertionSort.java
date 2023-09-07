package sorting;

import java.util.Arrays;

public class basic_insertionSort {
    public static void main(String[] args) {
        int[] nums = {6,3,1,8,9,345,-123};
        insertionSortIt(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void insertionSortIt (int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {


                if (arr[j] < arr[j-1]) {
                    swap (arr , j , j-1);
                } else {
                    break;
                }


            }
        }
    }



    // swap method
    static void swap (int[] arr , int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }





}

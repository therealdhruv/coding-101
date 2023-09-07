package sorting;
import java.util.Arrays;
public class basic_bubbleSort {
    public static void main(String[] args) {

        int[] nums = {2,3,5,7,-2,8,4,-542};
        bubbleSortIt(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void bubbleSortIt (int[] arr) {
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false ;
            for (int j = 1; j <= arr.length-i-1; j++) {
                // compare
                // swap if the item is smaller than previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true ;
                }
            }
            // if you did not swap for any particular value of i ==> array is sorted and hence stop the program
            if (!swapped) {     //   !false = true
                break;
            }
        }
    }
}
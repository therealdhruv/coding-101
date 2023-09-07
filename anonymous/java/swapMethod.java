package anonymous.java;

import java.util.Arrays;

public class swapMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swap(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }


    static void swap (int[] nums,int x,int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


}

package searching;

import java.util.Arrays;

public class FirstAndLastPosition {


    public static void main(String[] args) {

        int [] a = {2,2,3,4,5,5,5,5,5,5,6,6,7,8,9,20,24,24} ;
        //int [] a = {5,7,7,7,7,8,8,10};
        int t = 5 ;
        System.out.print(Arrays.toString(searchRange(a, t)));

    }

    public static int[] searchRange(int[] nums, int target) {


        int[] ans = {-1,-1};

        int start = searchhhhhhh(nums,target,true);
        int end = searchhhhhhh(nums,target,false);

        ans[0] = start;
        ans[1] = end;



        return ans ;
    }





    static int searchhhhhhh(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;


        int start = 0 ;
        int end = nums.length - 1;    // important to not forget -1

        while (start <= end) {
            // find the middle element
            // int middle = (start+end)/2 ;
            // int has a fixed size,
            // so it's possible that start+end might exceed the range and give error
            int middle = start + (end - start) / 2 ;


            if (target < nums[middle]) {
                end = middle - 1 ;
            } else if (target > nums[middle]) {
                start = middle + 1 ;
            } else {
                // potential answer is found
                ans = middle;



                if (findStartIndex){
                    end=middle-1;
                } else {
                    start=middle+1;
                }
            }
        }
        return ans;
    }
}
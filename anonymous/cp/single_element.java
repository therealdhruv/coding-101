package anonymous.cp;
//You are given a sorted array consisting of only integers where every element appears exactly twice,
//        except for one element which appears exactly once.

//        Return the single element that appears only once.


//Input: nums = [1,1,2,3,3,4,4,8,8]
//        Output: 2


//Input: nums = [3,3,7,7,10,11,11]
//        Output: 10




public class single_element {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,6,6,7,7,8,11,11};
        System.out.println(singleNonDuplicate(arr));
    }





    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length-1;


        // Basic conditions to check
        if (end == 0) {
            return nums[0];
        } else if (nums[start] != nums[start+1]) {
            return nums[start];
        } else if (nums[end] != nums[end-1]) {
            return nums[end];
        }


        // Binary search algorithm
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            } else if (mid%2 == 0 && nums[mid] == nums[mid+1] || mid%2 != 0 && nums[mid] == nums[mid-1]) {
                start = mid + 1;
            } else if (mid%2 != 0 && nums[mid] == nums[mid+1] || mid%2 == 0 && nums[mid] == nums[mid-1]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}

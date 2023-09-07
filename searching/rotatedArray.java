package searching;
public class rotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int tar = 3;
        System.out.println(search(arr,tar));
    }
    static int search (int[] nums , int target) {
        int pivot = findPivot(nums);
        // if you did not find pivot (pivot = -1) ==> it means aArray is not rotated ... hence you can apply the very normal and basic
        // binary search on the array and find the target
        if (pivot==-1){
            return binarySearch(nums,target,0, nums.length-1);
        }
        // now in case you've actually found out the pivot
        if (nums[pivot]==target) {
            return pivot;
        }
        if (target >= nums[0]) {
            binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }
     static int findPivot(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
//          Binary search part changing start and end
            if (arr[mid]<arr[start]) {
                end = mid - 1 ;
            } else {
                start = mid + 1 ;
            }
    //      Part returning the pivot
    //      Pivot is always the largest element in the array
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1 ;
            }
        }
        return -1;
    }
    static int binarySearch (int arr[] , int target,int start,int end) {
        while (start <= end) {             // <= and not just <    ...      please don't forget that
            // find the middle element
            // int middle = (start+end)/2 ;
            // int has a fixed size
            // so it's possible that start+end might exceed the range and give error
            int middle = start + (end - start) / 2 ;    // this has to be inside the loop as it needs to be updated constantly
            if (target < arr[middle]) {
                end = middle - 1 ;
            } else if (target > arr[middle]) {
                start = middle + 1 ;
            } else {
                return middle ;
            }
        }
        return -1 ;
    }
}

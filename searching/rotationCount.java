package searching;

public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(findCount(arr));
    }


    static int findCount(int[] arr) {


        int p = findPivot(arr);
        if (p != -1) {
            return p+1;
        }
        return 0;
    }




    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;  // {15,18,2,3,6,12}

            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if ( mid < end && arr[mid] > arr[mid+1]) {
                return mid;  // pivot is always the largest element of the array
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
        }
        return -1;
    }






}

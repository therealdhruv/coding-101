package searching;

public class infiniteArray {




    public static void main (String[] Args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }





    static int ans (int[] arr, int target) {

        // first find the range in which your target will lie
        // we check in chunks of 2 and keep multiplying by 2
        int start = 0;
        int end = 1;

        // condition for the target to be in the range is that -- it needs to be less than the end
        // if the target is less than the end we do not need to check if its larger than the start


        // we'll keep doubling the size until my target element is greater than the end

        // once the target !> end ==> its going to be behind end

        while (target > arr[end]) {

            int oldend = end;
            // end = previousEnd + sizeof(box) * 2
            end = end + (end - start + 1) * 2;          // IMPORTANT NOTE : Length of any given box inside array will be ==> |end - start + 1|
            start = oldend + 1;

        }
        return binarySearch(arr,target,start,end);
    }



    static int binarySearch (int arr[] , int target, int start, int end) {
        while (start <= end) {
            
            int middle = start + (end - start) / 2;
            
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

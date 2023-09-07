package searching;

public class basic_OrderAgnosticBS {
    public static void main (String args[]){

        int[] arr = {10,9,8,7,6,5,4,3,2,1} ;  // descending order -- orderagnostic required
        int target = 1 ;
        int ans = ordAgnostic(arr,target);  // calling the binary search algorithm
        System.out.print("The index of your target will be : " + ans);    // 9 should come ass my answer


    }


    static int ordAgnostic(int arr[] , int target) {
        int start = 0 ;
        int end = arr.length - 1;    // important to not forget -1

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end] ;


        while (start <= end) {
            // find the middle element


            // int middle = (start+end)/2 ;


            // int has a fixed size
            // so it's possible that start+end might exceed the range and give error

            int middle = start + (end - start) / 2 ;


            if (arr[middle] == target) {
                return middle;
            }


            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }


        }
        return -1;
    }
}

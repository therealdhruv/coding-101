package searching;

public class basic_binary_search {


    public static void main (String args[]) {
        // works only for ascendingly sorted arrays
        // for unsorted arrays Order-Agnostic binary search is required
        int[] arr = {4,5,6,7,0,1,2} ;
        int target = 0 ;
        int ans = binarySearch(arr,target);  // calling the binary search algorithm
        System.out.print(ans);    // 7 should come ass my answer

    }











    static int binarySearch (int arr[] , int target) {


        int start = 0 ;
        int end = arr.length - 1;    // important to not forget -1

        while (start <= end) {             // <= and not just <    
            // find the middle element


            // int middle = (start+end)/2 ;


            // int has a fixed size,
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

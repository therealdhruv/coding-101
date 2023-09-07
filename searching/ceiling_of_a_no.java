package searching;

public class ceiling_of_a_no {
    public static void main (String args[]) {

        // Q : Find the ceiling of the target from the array
        // eg : arr = [2,3,5,9,14,16,17];
        // target = 15;
        // output : 5

        int[] arr = {2,3,5,9,14,16,17};
        int target = 4 ;

        System.out.println("The index of the ceiling of target will be : " + findCeiling(arr,target));


    }


    static int findCeiling (int[] a,int t) {



        // but what if the target is greater than the greatest number in the array
        if (t > a[a.length - 1]) {
            return -1;
        }


        int start = 0;
        int end = a.length-1;


        while (start<=end) {

            int mid = start + (end-start)/2 ;

            if (a[mid]<t){
                start=mid+1;
            } else if (a[mid]>t) {
                end=mid-1;
            } else {
                return mid;
            }

        }

        return start;   // this what I was not getting


    }








}

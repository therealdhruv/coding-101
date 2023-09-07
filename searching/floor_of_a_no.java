package searching;

public class floor_of_a_no {
    public static void main (String[] args) {

        // Q : Find the floor of the target from the array
        // eg : arr = [2,3,5,9,14,16,17];
        // target = 15;
        // output : 4

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15 ;

        System.out.println("The index of the floor of target will be : " + findFloor(arr,target));

    }


    static int findFloor (int[] a,int t) {



        // but what if the target is greater than the greatest number in the array
        if (t > a [a.length - 1]) {
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
            }
            else {
                return mid;
            }

        }

        return start-1;   // just like ceiling but one minus


    }

}

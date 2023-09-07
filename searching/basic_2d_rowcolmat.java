package searching;

import java.util.Arrays;

public class basic_2d_rowcolmat {
    public static void main (String args[]) {

        int [] [] arr = {      // sorted in row and col wise manner

//                {10,20,30,40},
//                {15,25,35,45},
//                {228,29,37,49},
//                {33,34,38,50}


                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };

        System.out.println(Arrays.toString(search(arr,16)));

    }



    static int[] search (int[][] matrix , int target) {

        int r = 0 ;
        int c = matrix.length - 1;

        while (r< matrix.length && c>=0) {




            if (matrix[r][c] == target) {
                return new int[] {r,c};
            }
            else if (matrix[r][c] < target ) {
                r++;
            }
            else {
                c--;
            }




        }

        return new int[]{-1,-1};

    }



}

package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class linerSearchIn2Darray {
    // main method
    public static void main(String[] args) {
        int[][] arr1 = {
            {23,456,22,22},
            {3,45,2,5,2,4},
            {45,345,43,22,44}
        };
        int tar = 43;
        int[] result = search2darray(arr1, tar);
        // Instead of: System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
    // function for search in 2d array
     static int[] search2darray(int[][] arr,int target){
        int rowlen = arr[0].length;
        int columnlen = arr.length;
        for(int i=0;i<columnlen;i++){
            for(int j=0;j<rowlen;j++){
                int ele = arr[i][j];
                if(ele==target){
                    return new int[]{i,j};
            }
            }
            }
            // if target not found
             return new int[]{-1,-1};
        }



     }
    


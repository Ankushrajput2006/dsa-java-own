//package ARRAY;

import java.util.Arrays;

public class findMaxin2Darray {
     public static void main(String[] args) {
        int[][] arr1 = {
            {23,456,22,22},
            {3,45,2,5,2,4},
            {45,345,43,22,44}
        };
        System.out.println(findmax(arr1));
    }
    // function for search in 2d array
     static int findmax(int[][] arr){
        int rowlen = arr[0].length;
        int columnlen = arr.length;
        int max = 0;
        for(int i=0;i<columnlen;i++){
            for(int j=0;j<rowlen;j++){
                int ele = arr[i][j];
                if(ele>max){
                    max=ele;
            }
            }
            }
            return max;
        }

}

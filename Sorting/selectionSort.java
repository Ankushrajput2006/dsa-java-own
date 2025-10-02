//package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr1 = {23,2,13,23,53,2,45,27,7,8};
        selection(arr1);
        System.out.println(Arrays.toString(arr1));
        
    }
    static void selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n-i-1;
            int maxindex = findmaxindex(arr, 0, last);
            int temp = arr[maxindex];
            arr[maxindex] = arr[last];
            arr[last] = temp;
            
        }

    }
    static int findmaxindex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }   
        }
        return max;
    }
    
}

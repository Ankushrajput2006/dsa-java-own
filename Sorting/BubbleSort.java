//package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {4,2,6,23,32,11,33,2,78,3,2};
        bubble(arr1);
        System.out.println(Arrays.toString(arr1));
        
    }
    static void bubble(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            
        }
    }
    
}

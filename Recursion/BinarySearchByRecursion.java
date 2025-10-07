//package Recursion;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int tar = 4;
        System.out.println(binary(arr1,tar, 0, arr1.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binary(arr, target,mid+1, end);
        }
        return binary(arr, target, start, mid-1);
    }
}

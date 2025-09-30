//package ARRAY;

public class binaryeaarch {
    // mian method
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,7,8,9,12,14};
        int tar = 12;
        System.out.println(binarysearch(arr1, tar));
    }
    // function of binary search
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        for(int i=0;i<n;i++){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}

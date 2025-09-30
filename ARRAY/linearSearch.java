package ARRAY;

public class linearSearch {
     // main method
    public static void main(String[] args) {
        int[] arr1 = {12,34,223,67,22,77,22,46};
        int tar = 77;
        System.out.println(linearsearch1(arr1, tar));
    } 

    static int linearsearch1(int[] arr,int target){
       int len = arr.length;
        if(len == 0){
            return -1;
        }
        // loop for searching
        for(int i=0;i<len;i++){
            int ele = arr[i];
            if(ele==target){
                return i;
            }
        }
        // if target doesnot found
        return -1;
    }
}


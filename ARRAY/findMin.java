package ARRAY;

public class findMin {
    // main method
    public static void main(String[] args) {
        int[] arr1 = {77,3,3,56,23,77,2,64,2,55};
        System.out.println(min(arr1));
    }
    // function for finding minimum in array 
    // assuming arr is not a empty array
    static int min(int[] arr){
        int len = arr.length;
        int low = arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]<low){
                low = arr[i];
            }
        }
        return low;

    }
    

}

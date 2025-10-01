import java.util.Arrays;

public class binarySeaarch2DArray {
      // mian method
    public static void main(String[] args) {
        int[][] arr1 = {
                        {1,3,4,5},
                        {12,14,16,17},
                        {23,24,25,27}
        };
        int tar = 16;
        int[] result = binarysearch(arr1, tar);
        System.out.println(Arrays.toString(result));
    }
    // function of binary search
    static int[] binarysearch(int[][] arr,int target){ 
        int row = 0;
        int column = arr.length-1;
        while(row<column && column>=0){
            if(arr[row][column]==target){
                return new int[] {row,column};
            }
            else if(arr[row][column]<target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}

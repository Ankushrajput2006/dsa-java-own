import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1  = {8,7,5,3,5,1,6,9}; 
        insertion(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
            
        }
    }
    
}

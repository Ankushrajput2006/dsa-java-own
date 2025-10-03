import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr1 = {8,7,6,5,4,3,2,1};
        cycle(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void cycle(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i<n) {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}

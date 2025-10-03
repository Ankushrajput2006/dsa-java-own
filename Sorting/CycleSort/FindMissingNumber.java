//package CycleSort;

public class FindMissingNumber {
     public static void main(String[] args) {
        int[] arr1 = {3,2,0,1};
        System.out.println(cycle(arr1));

     }
    static int cycle(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i<n) {
            int correct = arr[i];
            if(arr[i]<n && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }
}
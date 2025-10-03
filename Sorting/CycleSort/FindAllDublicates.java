//package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDublicates {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,7,8,2,3,1};
        System.out.println(cycle(arr1));
    }
    static List<Integer> cycle(int[] arr){
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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        
        return ans;
    }
}

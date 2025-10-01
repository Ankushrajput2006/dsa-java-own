import java.lang.reflect.Array;
import java.util.Arrays;

public class findingFirstAndLastPositionOfElement {
    
    // mian method
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,7,8,12,12,14};
        int tar = 12;
        int[] result = searchRange(arr1, tar);
        System.out.println(Arrays.toString (result)); 
    }
     static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start= search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;        
    } 
    static int search(int[] arr,int target,boolean findfirstindex){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target) {
                end=mid-1;
            }
            else{
                ans = mid;
                if(findfirstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

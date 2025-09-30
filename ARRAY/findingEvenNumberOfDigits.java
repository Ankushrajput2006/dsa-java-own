 package ARRAY;

public class findingEvenNumberOfDigits {
    //main method
    public static void main(String[] args) {
        int[] arr1 = {12,234,1234,6543,688};
        System.out.println(findnumber(arr1));

    }
    // function for finding how many number of even count digits
    static int findnumber(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)==true){
                count ++;
            }
        }
        return count;
    }
    // function for finding number of even count digits
    static boolean even(int num){
        int numberofdigit = digit(num);
        if(numberofdigit%2==0){
            return true;
        }
        return false;
    }
    // function for finding count of digits
    static int digit(int num){
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}

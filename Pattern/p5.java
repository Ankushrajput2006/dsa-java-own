//package Pattern;

public class p5 {
     public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n*2;i++){
            int ind = i>n? 2*n-i: i;
            int spaces = n-ind;
              for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int j= 0;j<ind;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       }
}

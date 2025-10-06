//package Pattern;

public class p4 {
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n*2;i++){
            int ind = i>n? 2*n-i-1: i;
              for(int j=1;j<=ind;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

       }
}

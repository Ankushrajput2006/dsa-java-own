//package Recursion;

public class number {
    public static void main(String[] args) {
        int n = 1;
        print(1);
    }
    static void print(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

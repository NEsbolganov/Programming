package freelance;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
    }
    public static int RecPow(int x, int n){
        int result=x;
        if(x==0)return 1;
        while(n!=0)return x*RecPow(x,n-1);
        return 1;
    }
}

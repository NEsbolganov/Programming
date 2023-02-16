package OOP.IITU.Practice2;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Fib(1,0,a);
    }

    public static void Fib(int a, int b, int c){
        if(c==0)System.exit(1);
        System.out.println(a);
        Fib(a+b,a,c-1);
    }
}

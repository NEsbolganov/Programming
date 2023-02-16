package STL;

import java.util.Scanner;

public class Vasya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n%Solver(n,n-1)+" "+Solver(n,n-1));
    }
    public static int Solver(int n,int prev){
        if(prev%(n%prev)!=0)return prev;
        if(prev==2)return n-1;
        return Solver(n,prev-1);
    }
}

//https://acmp.ru/index.asp?main=task&id_task=352
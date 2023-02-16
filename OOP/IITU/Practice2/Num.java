package OOP.IITU.Practice2;


import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Counter(a));
    }
    public static int Counter(int a){
        int i=0;
        while(a>0){
            i++;
            a/=10;
        }
        return i;
    }
}

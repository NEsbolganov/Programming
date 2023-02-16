package OOP.IITU.Practice2;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res=1;
        for (int i = 1; i <= a; i++) {
            res*=i;
        }
        System.out.println(res);
    }
}

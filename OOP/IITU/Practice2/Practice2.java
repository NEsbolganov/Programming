package OOP.IITU.Practice2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println("together:"+(A+B)*0.9);
        System.out.println("skidka:"+(A+B)*0.1);
    }
}

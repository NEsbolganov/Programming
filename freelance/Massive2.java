package freelance;

import java.util.Scanner;

public class Massive2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b[][] = new int[7][4];
        int c[] = new int[7];
        for(int i =0;i<7;i++){
            int a=1;
            for(int j=0;j<4;j++){
                b[i][j] = in.nextInt();
                a*=b[i][j];
            }
            c[i]=a;
        }
        System.out.println();
        for(int i=0;i<7;i++){
            System.out.print(c[i]+" ");
        }
    }
}

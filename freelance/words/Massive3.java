package freelance.words;

import java.util.Scanner;

public class Massive3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P[][] = new int[4][6];
        int B[] = new int[4];
        for(int i =0;i<4;i++){
            int a=-99;
            for(int j=0;j<6;j++){
                P[i][j] = in.nextInt();
                if(a<P[i][j])a=P[i][j];
            }
            B[i]=a;
        }
        System.out.println();
        for(int i=0;i<4;i++){
            System.out.print(B[i]+" ");
        }
    }
}

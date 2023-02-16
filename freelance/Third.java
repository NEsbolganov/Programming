package freelance;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),c=1;
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
//                a[i][j] = in.nextInt();
                a[i][j]=c;
                System.out.print(a[i][j]+" ");
                c++;
            }
            System.out.println();
        }
        System.out.println("---------");
        for(int i=0;i<n;i++){
            System.out.print(a[2][i]+" ");
        }
        System.out.println();
        System.out.println("----------");
        int k = in.nextInt();
        for(int j=0;j<n;j++){
            System.out.print(a[n-j-1][k-1]+" ");
        }
    }
}

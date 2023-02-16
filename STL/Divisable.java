package STL;

import java.util.Scanner;

public class Divisable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first=0,second=0,i=0;
        while(n>0){
            if(i%2==0)first+=n%10;
            else second+=n%10;
            n/=10;
            i++;
        }
        if(Math.abs(first-second)%11==0) System.out.println("Yes");
        else System.out.println("No");
    }
}

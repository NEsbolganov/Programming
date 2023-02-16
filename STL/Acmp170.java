package STL;

import java.util.Scanner;

public class Acmp170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            if(Count(i,0,n,0)>0) {
                System.out.println(Count(i,0,n,0));
                System.exit(1);
            }
        }
    }
    public static int Count(int first,int sum,int initial,int cnt){
        if(sum==initial)return cnt;
        if(sum>initial)return -1;
        sum+=first;
        return Count(first+1,sum,initial,cnt+1);
    }
}

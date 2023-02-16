package STL;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res="";
        Vector<Integer>v = new Vector<Integer>();
        for(int i=0;i<n;i++){
            v.add(in.nextInt());
        }
        Collections.sort(v);
        int max = v.elementAt(n-1);
        String answers = Simple("",max,1);
        for(int i=0;i<n;i++){
            System.out.print(answers.charAt(v.elementAt(i)-1));
        }
    }
    public static String Simple(String current,int max,int prev){
        if(current.length()==max)return current;
        for(int i=prev+1;i<1000;i++){
            int cnt=0;
            for(int j=2;j<i;j++){
                if(i%j==0)cnt++;
            }
            if(cnt==0){
                current+=Integer.toString(i);
                prev=i;
                return Simple(current,max,prev);
            }
        }
        return current;
    }
}

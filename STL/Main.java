package STL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int a = in.nextInt();
        int b = in.nextInt();
        int first,second;
        if(toMax(a)<0)first=b-toMax(a);
        else first=toMax(a)-b;
        if(toMax(b)<0)second=a-toMax(b);
        else second=toMax(b)-a;
        if(first>second) System.out.println(first);
        else System.out.println(second);
    }
    public static int toMax(int a){
        boolean isBad=false;
        if(a<0)isBad=true;
        int tmp = Math.abs(a);
        ArrayList<Integer>list = new ArrayList<Integer>();
        while(tmp>0){
            list.add(tmp%10);
            tmp/=10;
        }
        Collections.sort(list);
        tmp=0;
        for(int i=0;i<list.size();i++){
            tmp+=list.get(i)*Math.pow(10,i);
        }
        if(isBad==true)return tmp*-1;
        return tmp;
    }

    public static int toMin(int a){
        boolean isBad=false;
        if(a<0)isBad=true;
        int tmp = Math.abs(a);
        ArrayList<Integer>list = new ArrayList<Integer>();
        while(tmp>0){
            list.add(tmp%10);
            tmp/=10;
        }
        Collections.sort(list,Collections.reverseOrder());
        tmp=0;
        for(int i=0;i<list.size();i++){
            tmp+=list.get(i)*Math.pow(10,i);
        }
        if(isBad==true)return tmp*-1;
        return tmp;
    }
}

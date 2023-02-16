package STL;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Stones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        Vector<Integer>v = new Vector<Integer>();
        /*for(int i=0;i<n;i++){
            v.add(in.nextInt());
        }*/
        String s= "12:05PM";
        String s1="";
        int time = Integer.parseInt(s.substring(0,2));
        time+=2;
        s1+=Integer.toString(time);
        System.out.println(s.substring(s.length()-2));
        //System.out.println(Integer.parseInt(s.substring(0,2)));
        s+=Integer.toString(123);
        //System.out.println(s);
        System.out.println(s1);
        Collections.sort(v);
//        System.out.println(minDif(v,0,1000));
    }
    public static int minDif(Vector<Integer>v,int n,int dif){
        if(n==v.size())return dif;
        Collections.sort(v);
        int sum1=0,sum2= 0;
        for(int i=0;i<v.size();i++){

        }
        if(dif>Math.abs(sum2-sum1))dif=Math.abs(sum2-sum1);
        n++;
        return minDif(v,n,dif);
    }
}/*
5 8 13 27 14
5 8 13 14 27
*/
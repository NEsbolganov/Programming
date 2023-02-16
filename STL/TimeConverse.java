package STL;

import java.util.Scanner;

public class TimeConverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        String s1="";
        int time;
        if(s.substring(s.length()-2)=="AM"){
            time=Integer.parseInt(s.substring(0,2));
            time-=12;
            if(time==0)s1="00";
            s1=Integer.toString(time);
        }
        if(s.substring(s.length()-2).equals("PM")){
            time=Integer.parseInt(s.substring(0,2));
            time+=12;
//            System.out.println("Time="+time);
            s1=Integer.toString(time);
        }
        for(int i=2;i<=s.length()-3;i++){
            s1+=s.charAt(i);
        }
        return s1;
    }
}

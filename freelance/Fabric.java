package freelance;

import java.util.Scanner;

public class Fabric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,x2,x3;
        String a = "0.8*x1+0.5*x2+0.6*x3<=800";
        String b = "0.4*x1+0.4*x2+0.3*x3<=600";
        String c = "0.1*x2+0.1x3<=120";
        System.out.println(a+"\n"+b+"\n"+c);
        System.out.println("(0.4*x1+0.4*x2+0.3*x3<=600)*2-(0.8*x1+0.5*x2+0.6*x3<=800)=0.3x2=400");
        System.out.println("x2<=1333.3");
        x2=63.6/0.1;
        x3=(120-(x2*0.1))/0.1;
        x1=(800-(0.6*x3)-(0.5*x2))/0.8;
//        System.out.println(x1);
        System.out.println(108*x1+112*x2+126*x3);
    }
}

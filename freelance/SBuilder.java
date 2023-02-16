package freelance;

import java.util.Scanner;

public class SBuilder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String s = in.nextLine();
        str.append(s);
        if(cntMinutes(str)>180) System.out.println("Plane "+str.substring(0,3)+" had to leave the airport "+(cntMinutes(str)-180)+" minutes ago");

    }
    public static int cntMinutes(StringBuilder str){
        int min1=0,min2=0;
        min1=Character.getNumericValue(str.charAt(str.length()-1))+Character.getNumericValue(str.charAt(str.length()-2))*10+Integer.parseInt(str.substring(str.length()-5,str.length()-3))*60;
        min2=Integer.parseInt(str.substring(str.length()-8,str.length()-6))+Integer.parseInt(str.substring(str.length()-11,str.length()-9))*60;
        return Math.abs(min1-min2);
    }
}

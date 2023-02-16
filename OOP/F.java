package OOP;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        City cities[] = new City[n];
        Flat flats[] = new Flat[50];
        String s =in.nextLine();
        for(int i=0;i<n;i++){
            s = in.nextLine();
            //System.out.println(getCity(s));
            City a = new City(getCity(s),Integer.parseInt(s.substring(s.length()-1)));
            cities[i] = a;
            int size = Integer.parseInt(s.substring(s.length()-1));
            //System.out.println(size);
            for(int j=0;j<size;j++){
                String str = in.nextLine();
                Flat test = new Flat(getName(str),getPrice(str),Integer.parseInt(s.substring(s.length()-1)));
                cities[i].addFlat(test,j);
            }
            System.out.println(cities[i].name+cities[i].getDif());
        }


    }
    public static String getCity(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')return s.substring(0,i);
        }
        return s;
    }
    public static String getName(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')return s.substring(0,i);
        }
        return s;
    }
    public static int getPrice(String s){
        String a="";
        for(int i=s.length()-3;i>=0;i--){
            if(Character.isDigit(s.charAt(i))==true){
                a=s.charAt(i)+a;
            }else{
                i=0;
            }
        }
        return Integer.parseInt(a);
    }
}

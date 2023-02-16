package freelance;

import java.util.Scanner;

public class Rains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rains[] = new double[30];
        double fHalf=0, sHalf=0;
        for(int i=0;i<30;i++){
//            rains[i] = in.nextDouble();
            rains[i] = getRandomNumber(0, 5);
        }
        for(int i=0;i<15;i++)fHalf+=rains[i];
        for(int i=15;i<30;i++)sHalf+=rains[i];
        if(fHalf>sHalf) System.out.println("There were more rains in the first half");
        else if(sHalf>fHalf)System.out.println("There were more rains in the second half");
        else System.out.println("There were equal rains in both halfes");
        double fDecade=0,sDecade=0,lDecade=0;
        for(int i=0;i<10;i++)fDecade+=rains[i];
        for(int i=10;i<20;i++)sDecade+=rains[i];
        for(int i=20;i<30;i++)lDecade+=rains[i];
        double max = (Math.max(lDecade,(Math.max(fDecade,sDecade))));
        if(max == fDecade) System.out.println("There were more rains in the first decade");
        if(max == sDecade) System.out.println("There were more rains in the second decade");
        if(max == lDecade) System.out.println("There were more rains in the last decade");
    }

    public static double getRandomNumber(double min, double max) {
        return (double) ((Math.random() * (max - min)) + min);
    }
}

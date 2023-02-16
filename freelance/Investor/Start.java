package freelance.Investor;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello, dear Investor! Input your name and bank, please:");
        Scanner in = new Scanner(System.in);
        Investor invest = new Investor(in.next(),in.nextDouble());
        Organisations org[] = new Organisations[2];
        LinkedHashMap<Double,Object>pay = new LinkedHashMap<Double, Object>();
        for(int i=0;i<2;i++){
            org[i] = new Organisations(in.next(),in.nextDouble(),in.nextDouble());
            pay.put(org[i].scam,org[i]);
            for(int j=0;j<3;j++){
                Double risks = in.nextDouble()+org[i].risk;
                Double incomes = in.nextDouble()+org[i].income;
                org[i].too[j] = new TOO(in.next(),risks,incomes);
                pay.put(org[i].too[j].scam,org[i].too[j]);
                for(int z=0;z<3;z++){
                    Double risks1 = in.nextDouble()+org[i].too[j].risk;
                    Double incomes1 = in.nextDouble()+org[i].too[j].income;
                    org[i].too[j].ips[z] = new IP(in.next(),risks1, incomes1);
                }
            }
        }
        Set<Double> keys = pay.keySet();
        double sum=0;
        for (Double key : keys) {
            sum+=key;
        }
        for(Double key:keys){
            System.out.println(invest.bank*(key/sum)+" "+pay.get(key));
        }
    }
}

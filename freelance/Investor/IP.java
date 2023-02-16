package freelance.Investor;

import java.util.Random;

//IP Это ИП
public class IP {
    String name;
    double risk;
    double income;
    boolean success;
    double scam;
    IP(String name,double risk,double income){
        this.name = name;
        this.risk = risk;
        this.income = income;
        Random rw = new Random();
        this.success = rw.nextBoolean();
        this.scam = Math.abs(income-risk);
    }
}

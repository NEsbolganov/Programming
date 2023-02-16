package freelance.Investor;

import java.util.Random;

public class TOO {
    String name;
    double risk;
    double income;
    IP ips[] = new IP[3];
    boolean success;
    double scam;
    TOO(String name,double risk,double income){
        this.name = name;
        this.risk = risk;
        this.income = income;
        Random rw = new Random();
        this.success = rw.nextBoolean();
        this.scam = Math.abs(income-risk);
    }
}

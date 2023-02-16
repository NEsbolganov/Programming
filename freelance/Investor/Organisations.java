package freelance.Investor;

import java.util.Random;

public class Organisations {
    String name;
    double risk;
    double income;
    TOO too[] = new TOO[3];
    boolean success;
    double scam;
    Organisations(String name,double risk,double income){
        this.name = name;
        this.risk = risk;
        this.income = income;
        Random rw = new Random();
        this.success = rw.nextBoolean();
        this.scam = Math.abs(income-risk);
    }
}

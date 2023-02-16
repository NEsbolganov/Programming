package freelance.bank;

import java.util.Vector;

//кассир
public class Cashier {
    String name;
    boolean Paid;
    double income;
    Cashier(String name,boolean Paid){
        this.name = name;
        this.Paid = Paid;
    }
    public void Transfer(int a){
        this.income=a*0.15;
    }
}

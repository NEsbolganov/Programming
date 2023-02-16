package freelance.bank;

import java.util.Vector;

//банк
public class Bank {
    String name;
    int cntCashiers;
    Vector<Cashier>cashiers = new Vector<Cashier>(cntCashiers);
    int cntAccountants;
    Vector<Accountant>accountants = new Vector<Accountant>(cntAccountants);
    Bank(String name,int cntCashiers,int cntAccountants,int i){
        this.name = name;
        this.cntAccountants = cntAccountants;
        this.cntCashiers = cntCashiers;

    }
}

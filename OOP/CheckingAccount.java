package OOP;

public class CheckingAccount extends Account{
    static int cnt;
    CheckingAccount(double balance, int accNum){
        super(balance , accNum);
        cnt++;
    }
    CheckingAccount(Account a){
        super(a.balance, a.accNumber);
        cnt++;
    }
    public void Fee(Account a){
        this.balance-=a.cntTransfers*0.2;
    }
    public void info(){
        System.out.println("The acc "+this.accNumber+" has only "+this.balance);
    }
}

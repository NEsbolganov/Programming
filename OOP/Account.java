package OOP;

public class Account {
    double balance;
    int accNumber;
    int cntTransfers;
    public Account(double balance, int accNumber){
        this.balance=balance;
        this.accNumber=accNumber;

    }
    public void deposit(double sum){
        this.balance+=sum;
    }
    public void withdraw(double sum){
        this.balance-=sum;
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public void getAccNumber(){
        System.out.println("Your ID/AccNumber is: "+ accNumber);
    }
    public void transfer(double amount, Account acc2){
        acc2.deposit(amount);
        this.balance-=amount;
        cntTransfers++;
    }

    public String toString(){
        System.out.println("Account number:"+ accNumber + "has "+ balance+" $ in the bank");
        return null;
    }
    public double getBal(){
        return this.balance;
    }
    public int getID(){
        return this.accNumber;
    }
}

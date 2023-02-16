package freelance;

public class Account {
    String id;
    String name;
    int balance;
    Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    Account(String id,String name,int balance){
        this.id=id;
        this.name = name;
        this.balance = balance;
    }
    public String getid(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void credit(int a){
        this.balance+=a;
    }
    public void debit(int a){
        if(this.balance<=a){
            System.out.println("Amount exceeded balance");
        }
        this.balance=-a;
    }
    public void transferTo(Account anotherAccount, int amount){
        this.debit(amount);
        anotherAccount.credit(amount);
    }
}

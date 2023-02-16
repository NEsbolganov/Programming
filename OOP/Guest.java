package OOP;

public class Guest extends Person{
    double pay;
    Guest(String name, int age,boolean works  ){
        super(name, age, works);
        this.works=false;
        this.pay=0;
    }
    public void getPaid(Waiter a){
        this.pay=a.getCheck();
    }
}

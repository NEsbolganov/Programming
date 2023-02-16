package OOP;
public class Waiter extends Person{
    double wage;
    double check;
    Waiter(String name, int age,boolean works,  double wage){
        super(name, age, works);
//        this.works=true;
        this.wage=wage;
    }
    public void setWage(double wage){
        this.wage=wage;
    }
    public void setCheck(double a){// счет за столик
        this.check=a;
    }
    public double getCheck(){// счет за столик
        return this.check;
    }
    public void getWage(){
        System.out.println(this.wage);
    }
}

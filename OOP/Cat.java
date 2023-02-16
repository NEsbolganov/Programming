package OOP;

public class Cat extends Animal{
    boolean isAlive=true;
    public Cat(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void food(){
        System.out.println("Cat is dead xD");
        isAlive=false;
    }
    public void info(){
        if(isAlive) System.out.println("Cat's name: "+name+" ,its weight and age respectively: "+weight+" "+age);
        else System.out.println("Cat was eaten");
    }
}

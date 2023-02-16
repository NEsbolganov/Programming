package OOP;

public class Person {
    String name;
    int age;
    boolean works;//does he have job or not
    public Person(String name, int age, boolean works){
        this.name=name;
        this.age=age;
        this.works=works;
    }

    public Person() {

    }

    public void setWork(boolean works){
        this.works=works;
    }
    public void setAge(int a){
        this.age=a;
    }
    public String toString(){
        return ("My name is "+this.name+" I'm "+this.age+"years old, my work status is: "+ this.works);
    }
}

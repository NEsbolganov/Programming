package KBTU.LAB5;

import OOP.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employee extends Person implements Comparable{
    String name;
    double salary;
    int age;
    String insuranceNumber;
    Date hireDate;
    Employee(String name, int age, double salary, String insuranceNumber,String hireDate) {
        super(name, age, true);
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        Date t=null;
        try {
            t = ft.parse(hireDate);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        this.name = name;
        this.salary=salary;
        this.age = age;
        this.insuranceNumber = insuranceNumber;
        this.hireDate = t;
    }

    public Employee() {
        super();
    }

    public int equals(Employee a){
        if(a==null || getClass()!=a.getClass())return -1;
        if(salary == a.salary)return 1;
        return 0;
    }
    @Override
    public String toString(){
        return ("My name is "+this.name+". I'm "+this.age+" years old and I get "+this.salary);
    }
    public void getDate(){
        System.out.println(this.hireDate);
    }
    public String getName(){
        return this.name;
    }
    public int compare(Object a) {
        Employee b = (Employee) a;
        if(b.getClass()!=this.getClass())return -2;
        if(this.salary<b.salary)return -1;
        if(this.salary>b.salary)return 1;
        return 0;
    }

}


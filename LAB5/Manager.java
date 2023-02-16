package KBTU.LAB5;

import java.util.Vector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee implements addWorker,Comparable{
    Vector<Employee>team = new Vector<>();
    Manager(String name, int age, double salary,String insuranceNumber,String hireDate){
        this.name = name;
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        Date t=null;
        try {
            t = ft.parse(hireDate);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        this.salary=salary;
        this.insuranceNumber=insuranceNumber;
        this.age=age;
        this.hireDate=t;
    }
    public void addWorker(Object a){
        Employee b = (Employee) a;
        this.team.add(b);
    }
    public void getTeam(){
        for(int i=0;i< team.size();i++) System.out.println(team.get(i).getName());
    }
    public void bonus(){
        double bonus=1;
        bonus+=0.1* team.size();
        this.salary *= bonus;
    }
    public int compare(Object a){
        Manager that = (Manager) a;
        if(this.getClass()!=a.getClass())return -2;
        if(this.salary<that.salary)return -1;
        if(this.salary>that.salary)return 1;
        that.bonus();
        this.bonus();
        if(salary>that.salary)return 1;
        if(salary<that.salary)return -1;
        return 0;
    }
    public String compareByDate(Object a){
        Manager that = (Manager) a;
        if(this.hireDate.compareTo(that.hireDate)>0)return (that.name+" has worked longer");
        if(this.hireDate.compareTo(that.hireDate)<0)return (this.name+" has worked longer");
        if(this.hireDate.compareTo(that.hireDate)==0)return ("they both worked the same period");
        return null;
    }
}

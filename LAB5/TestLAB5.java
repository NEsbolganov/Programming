package KBTU.LAB5;

public class TestLAB5 {
    public static void main(String[] args) {
        Employee Nartay = new Employee("Nartay",19,250000,"123456","28.11.2022");
        //Nartay.getDate();
        Employee Estay = new Employee("Estay",23,249000,"123456","27.08.2021");
        //System.out.println(Nartay.compare(Estay));
        Manager Danelya = new Manager("Danelya",21,290000,"123456","17.10.2022");
        Danelya.addWorker(Nartay);
        Danelya.addWorker(Estay);
        //Danelya.getTeam();
        Manager Aidos = new Manager("Aidos",25,290000,"14789","28.02.2020");
        Employee Era = new Employee("Erasyl",19,58000,"123658","29.05.2019");
        //Danelya.bonus();
        System.out.println(Danelya.compare(Aidos));
        //System.out.println(Danelya.salary);
        System.out.println(Danelya.compareByDate(Aidos));
    }
}

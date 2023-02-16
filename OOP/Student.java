package OOP;

import java.util.Scanner;

public class Student{
    String name;
    double mark;
    int age;
    static double avg=0;
    Student(String name, double mark, int age){
        this.name = name;
        this.age = age;
        this.mark = mark;
        avg+=mark;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        for(int i=0;i<a;i++){
            String gName = in.next();
//            in.nextLine();
            int cnt = in.nextInt();
            Group g1 = new Group(gName,cnt);
            for(int j=0;j<cnt;j++){
                String sname = in.next();
                in.next();
                double mark = in.nextDouble();
//                in.next();
                int age = in.nextInt();
//                in.next();
                Student st1 = new Student(sname,mark,age);
                g1.addStud(st1,j);
            }
            System.out.println(g1.Top());
            System.out.println(g1.getAvg());
        }
    }
}

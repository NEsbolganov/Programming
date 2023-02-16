package OOP;

public class Group {
    String name;
    int cnt;
    Student students[] = new Student[cnt];
    Group(String name, int cnt){
        this.name = name;
        this.cnt= cnt;
    }
    public void addStud(Student a,int i){
        students[i] = a;
    }
    public String Top(){
        double max=-1;
        int index=0;
        for(int i=0;i<this.cnt;i++){
            if(max<students[i].mark){
                max=students[i].mark;
                index = i;
            }
        }
        return ("MaxGPA of "+this.name+" has "+students[index].name);
    }
    public double getAvg(){
        return this.students[students.length-1].avg/cnt;
    }
}

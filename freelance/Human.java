package freelance;

public class Human {
    String data;
    int age;
    String name;
    Human mother;
    String level;
    String group;
    boolean isMan;

    public Human(String data, int age, String name, Human mother, String level, String group, boolean isMan) {
        this.data = data;
        this.age = age;
        this.name = name;
        this.mother = mother;
        this.level = level;
        this.group = group;
        this.isMan = isMan;
    }

    Human(){
    };

    public Human(String data) {
        this.data = data;
    }

    public Human(String data, int age) {
        this.data = data;
        this.age = age;
    }

    public Human(String data, int age, String name) {
        this.data = data;
        this.age = age;
        this.name = name;
    }

    public Human(String data, int age, String name, Human mother) {
        this.data = data;
        this.age = age;
        this.name = name;
        this.mother = mother;
    }

    public Human(String data, int age, String name, Human mother, String level) {
        this.data = data;
        this.age = age;
        this.name = name;
        this.mother = mother;
        this.level = level;
    }

    public Human(String data, int age, String name, Human mother, String level, String group) {
        this.data = data;
        this.age = age;
        this.name = name;
        this.mother = mother;
        this.level = level;
        this.group = group;
    }

    public Human(String data, String name) {
        this.data = data;
        this.name = name;
    }

    public Human(int age, String name, String level, String group) {
        this.age = age;
        this.name = name;
        this.level = level;
        this.group = group;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String data, String name, boolean isMan) {
        this.data = data;
        this.name = name;
        this.isMan = isMan;
    }

    @Override
    public String toString() {
        return "Human:\n"
                +"Date of birth: "+this.data
                +"\nName: "+this.name
                +"\nAge: "+this.age
                +"\nmother name: "+this.mother.name
                +"\nmusician level and group: "+this.level+"|"+this.group;
    }

    public static void main(String[] args) {
        Human mother = new Human("03.01.1971","Gulmira",false);
        Human Me = new Human("07.11.2003",19,"Nartay",mother,"none","kazahgenius",true);
        Human brother = new Human("09.09.1999",23,"Estay",mother,"super-talant","APS",true);
        System.out.println(Me.toString());
    }
}

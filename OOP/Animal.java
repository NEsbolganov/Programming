package OOP;

public abstract class Animal {
    int age;
    String name;
    double weight;
    public interface Action{
        public void run();
        public void eat();
        public void food();
    }
}

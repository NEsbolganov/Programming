package OOP;

public abstract class Building {
    String name;
    String address;
    int year;
    String builder;
    boolean isHistoric;
    public abstract String toString();
    public void setHistoric(boolean h){
        this.isHistoric=h;
    }
    public void getHistoric(){
        System.out.println(this.isHistoric);
    }
}

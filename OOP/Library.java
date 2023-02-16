package OOP;

public class Library extends Building{
    double area;
    int users;
    Library(String name, String address, String builder, boolean isHistoric, double area, int users){
        this.users=users;
        this.isHistoric=isHistoric;
        this.area=area;
        this.builder=builder;
        this.address=address;
        this.name=name;
    }
    @Override
    public String toString() {
        return ("The library is in "+this.address+" and its area is "+ this.area+", it has " + this.users +" users ");
    }
    public void userAdd(int added){
        this.users+=added;
    }
    public void getUsers(){
        System.out.println("Library has "+this.users);
    }
}

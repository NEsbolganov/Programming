package OOP;

public class Resistor extends Circuit{
    public double R;
    Resistor(double R){
        this.R=R;
    }
    public void getR(){
        System.out.println(this.R);
    }
}

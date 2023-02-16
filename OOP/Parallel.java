package OOP;
public class Parallel extends Circuit{
    public double R;
    Parallel(Resistor a, Resistor b){
        this.R=(a.R+b.R)/(a.R*b.R);
    }
    Parallel(double a,double b){
        this.R=(a+b)/(a*b);
    }
}

package OOP;

public abstract class Circuit {
    public double R;
    public void Series(double a){
        this.R+=a;
    }
    public void Parallel(double a){
        this.R=(a+this.R)/(a*this.R);
    }
    public double getResistance(){
        return this.R;
    }

}

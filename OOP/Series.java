package OOP;
public class Series extends Circuit{
    public double R;
    Series(Circuit a, Circuit b){
        this.R = a.R+b.R;
    }
}

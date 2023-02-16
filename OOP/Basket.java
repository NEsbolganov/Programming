package OOP;
public class Basket{
    int sum;
    int number;
    Basket(int b){
        this.number=b;
    }
    public void add(Product a){
        sum+=a.price;
    }
    public String toString(){
        return ("Number "+this.number+" basket's sum is: "+ this.sum );
    }
    public void rate(Product a, double rating){
        a.rate(rating);
    }
}

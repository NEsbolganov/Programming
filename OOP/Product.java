package OOP;

public class Product {
    int price;
    String name;
    double rating;
    int cnt;
    public Product(){
    }
    Product(String name, int price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
        cnt=1;
    }
    public void rate(double a){
        cnt++;
        rating = (rating+a)/cnt;
    }
    public void getRate(){
        System.out.println(this.rating);
    }
}

package freelance;

public class Camry <T> {
    T vin; //vin - вин код машины
    double price;
    int mileage;
    static double avgP=0;
    static int cnt = 0;
    boolean accident;
    Camry(T vin, double price, int mileage){
        this.vin = vin;
        this.price = price;
        this.mileage = mileage;
        avgP+=price;
        cnt++;
        this.accident = false;
    }
    static double getAvgP(){
        return avgP/cnt;
    }
    public void setMileage(int mileage){
        this.mileage-=mileage;
        this.price=this.price-(this.price*0.05);
    }// этот метод чтобы скручивать пробег и с каждым сркучиванием машина дешевеет
    public void AMP(){
        this.accident = true;
        this.price=this.price - (this.price*0.2);
    }
    public void getPrice(){
        System.out.printf("Price is: %.1f",Math.abs(this.price));
    }
}

package freelance;

public class Car {
    public String type;
    public double engineV;
    public double avgCost;
    public int mileage;
    public String clr;
    public String brand;

    public Car(String type) {
        this.type = type;
    }

    public Car(String type, double engineV) {
        this.type = type;
        this.engineV = engineV;
    }

    public Car(String type, double engineV, double avgCost) {
        this.type = type;
        this.engineV = engineV;
        this.avgCost = avgCost;
    }

    public Car(String type, double engineV, double avgCost, int mileage) {
        this.type = type;
        this.engineV = engineV;
        this.avgCost = avgCost;
        this.mileage = mileage;
    }

    public Car(String type, double engineV, double avgCost, int mileage, String clr) {
        this.type = type;
        this.engineV = engineV;
        this.avgCost = avgCost;
        this.mileage = mileage;
        this.clr = clr;
    }

    public Car(String type, double engineV, double avgCost, int mileage, String clr, String brand) {
        this.type = type;
        this.engineV = engineV;
        this.avgCost = avgCost;
        this.mileage = mileage;
        this.clr = clr;
        this.brand = brand;
    }

    public Car(String clr, String brand) {
        this.clr = clr;
        this.brand = brand;
    }

    public Car(String type, int mileage, String clr, String brand) {
        this.type = type;
        this.mileage = mileage;
        this.clr = clr;
        this.brand = brand;
    }

    public Car(double engineV, double avgCost, int mileage) {
        this.engineV = engineV;
        this.avgCost = avgCost;
        this.mileage = mileage;
    }

    public Car(double avgCost, int mileage, String clr) {
        this.avgCost = avgCost;
        this.mileage = mileage;
        this.clr = clr;
    }

    @Override
    public String toString() {
        return ("The info about this car:\n"+"brand:"+brand+"\ntype:"+type+"\nengine Volume:"+engineV+"\ncolour:"+clr+"\nmileage:"+mileage);
    }

    public static void main(String[] args) {
        Car Eclass = new Car("sedan",3.5,23000000,56384,"nardo gray","mercedes");
        Car camry = new Car("sedan",2.5,28000000);
        Car Es = new Car(32000000,25008,"white");
        Car Is = new Car("sedan",2.5);
        Car Lx = new Car(3.5,57000000,87531);
        System.out.println(camry.toString());
        System.out.println(Eclass.toString());
        System.out.println(Es.toString());
        System.out.println(Lx.toString());
        System.out.println(Is.toString());
    }
}

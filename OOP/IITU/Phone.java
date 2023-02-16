package OOP.IITU;

public class Phone {
    private String number;
    private String model;
    private Double weight;
    public Phone(String number,String model,double weight){
        this.number=number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number,String model){
        this.number=number;
        this.model=model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println(name+" "+this.getNumber());
    }

    @Override
    public String toString(){
        return (this.getModel()+" "+this.getNumber()+" "+this.getWeight());
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("87072507609","Iphone 11", 254);
        System.out.println(phone1.toString());
        Phone phone2 = new Phone("87472507609","Iphone X", 200);
        System.out.println(phone2.toString());
        Phone phone3 = new Phone("87762507609","Iphone 11", 254);
        System.out.println(phone3.toString());
        phone1.receiveCall("Nartay");
        phone2.receiveCall("Estay");
        phone3.receiveCall("Aidos");
    }
}

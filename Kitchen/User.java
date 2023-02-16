public class User {
    String name;
    double height;
    double weight;
    double idealWeight;
    boolean isMan;
    boolean needLose;
    User(){

    }
    User(String name,double height, double weight,boolean isMan){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.isMan = isMan;


    }

    public void setIdealWeight() {
        if(isMan==true) this.idealWeight = (this.height-100)*1.15;
        else this.idealWeight = (this.height-110)*1.15;
    }

    public void setNeedLose() {
        if(this.idealWeight<this.weight)this.needLose=true;
        if(this.idealWeight>this.weight)this.needLose=false;
    }
    public String toString(){
        return ("I'm "+this.name+" my height is "+ this.height+" ,weight: "+ this.weight);
    }

    public double getIdealWeight() {
        return this.idealWeight;
    }
}

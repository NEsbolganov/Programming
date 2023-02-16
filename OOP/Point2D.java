package OOP;

public class Point2D {
    double x;
    double y;
    Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void getXY(){
        double a[] =new double[2];
        a[0]=this.x;
        a[1]=this.y;
        System.out.println(a[0]+" "+a[1]);
    }
    public String toString(){
        return ("X="+this.x+" Y="+this.y);
    }
    public boolean equals(Point2D a){
        boolean check = true;
        if(a.x!=this.x)check=false;
        if(a.y!=this.y)check=false;
        return check;
    }
}

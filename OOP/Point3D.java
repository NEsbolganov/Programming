package OOP;

import java.awt.*;

public class Point3D extends Point2D{
    double z;

    Point3D(double x, double y, double z) {
        super(x, y);
        this.z=z;
    }
    public double[] getXYZ(){
        double a[] = new double[3];
        a[0]=this.x;
        a[1]=this.y;
        a[2]=this.z;
        return (a);
    }
    public void setXYZ(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setZ(double z){
        this.z=z;
    }
    public void getZ(){
        System.out.println(this.z);
    }
    public String toString(){
        return ("X="+this.x+" Y="+this.y+" Z="+this.z);
    }
    public boolean equals(Point3D a){
        boolean check = true;
        if(a.x!=this.x)check=false;
        if(a.y!=this.y)check=false;
        if(a.z!=this.z)check=false;
        return check;
    }
}

class Rectangle1{
    private double length;
    private double width;
    Rectangle1(){
        System.out.println("i am non perm constructor");
    }
    Rectangle1(double l,double w){
        System.out.println("I am rectangle1 parameterized constructor");
        this.length=l;
        this.width=w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    double area(){
        return this.length*this.width;
    }
}
class cuboid extends Rectangle1{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    cuboid(double l,double w,double h){
        super(l,w);
        this.height=h;
    }
    double Volume(){
        return this.area()*this.height;
    }
}
public class cwh_52_prectangular {
    public static void main(String[] args) {
        Rectangle1 obj=new Rectangle1(12,12);
        System.out.println(obj.area());

        cuboid ne=new cuboid(12,12,12);
        System.out.println(ne.Volume());

    }
}

class Circle{
    public int radious;

    public int getRadious() {
        return radious;
    }

    Circle(){
        System.out.println("I am non parm of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radious=r;
    }
   public double area(){
        return Math.PI*this.radious*this.radious;
    }
}
class Cylinder1 extends Circle{
    public int height;

    public int getHeight() {
        return height;
    }

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
        this.height=h;
    }
    public double Volume(){

        return Math.PI*this.radious*this.radious*this.height;
    }
}
public class chw_52_practiceset10 {
    public static void main(String[] args) {
        //problem1 and 3
        Cylinder1 obj=new Cylinder1(12,14);

        System.out.println(obj.Volume());

        Circle cs=new Circle(12);

        System.out.println(cs.area());


    }
}

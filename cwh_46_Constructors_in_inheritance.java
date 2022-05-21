import java.util.concurrent.Callable;

class base1{
    base1(){
        System.out.println("I am a construstor of base 1");
    }
    base1(int a){
        System.out.println("I am a constructor with value of a as : "+a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived constructor");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am an overloaded constructor with value of b as : "+b);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child of derived constructor");
    }
   ChildofDerived(int a,int b,int c){
       super(a,b);
        System.out.println("I am an overliaded constructor of Darived with vlaue of c as : "+c);
    }
}

public class cwh_46_Constructors_in_inheritance {
    public static void main(String[] args) {
        //base1 b1= new base1();
        //Derived1 d1= new Derived1(14,9);
        ChildofDerived cd=new ChildofDerived(12,13,14);

            }
        };




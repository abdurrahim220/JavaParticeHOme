import com.sun.security.jgss.GSSUtil;

interface Bicycle{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increnent);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornk2g();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    @Override
    public void applyBreak(int decrement){
        System.out.println("Applying break...!");
    }
    @Override
    public void speedUp(int increnent){
        System.out.println("Applying speed....!");
    }
   public void blowHornk3g(){
        System.out.println("royal dj dj dj dj.....!");
    }
    public void blowHornk2g(){
        System.out.println("masuma dj dj dj dj.....!");
    }
}

public class cwh_55_interface {
    public static void main(String[] args) {
        AvonCycle ch=new AvonCycle();
        ch.applyBreak(5);
        //YOu can create properties in interface
        System.out.println(ch.a);
        //you can not modifi it
        //ch.a=45;
        //System.out.println(ch.a);
        ch.blowHorn();
        ch.blowHornk3g();
        ch.blowHornk2g();

    }
}

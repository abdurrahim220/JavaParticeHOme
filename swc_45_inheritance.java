public class swc_45_inheritance {
    public static void main(String[] args) {
        base b=new base();
        //Derived b=new Derived();
        b.setX(4);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setY(44);
        System.out.println(d.getY());
    }
}
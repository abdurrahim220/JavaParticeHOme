public class base {
    int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe() {

        System.out.println("I am a constructor");
    }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and setting y now");
        this.y = y;
    }
}

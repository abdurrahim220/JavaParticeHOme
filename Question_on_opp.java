/*class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
class cellphone{
    public void ringing(){
        System.out.println("Ringing...!");
    }
    public void vibrate(){
        System.out.println("Vibrating....!");
    }
    public void callFriend(){
        System.out.println("Calling rafik...!");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
class Tomy{
    public void hit(){
        System.out.println("Hitting the enemy..!");
    }
    public void run(){
        System.out.println("Running the enemy...!");
    }
    public void fire(){
        System.out.println("Firing the enemey...!");
    }
}
public class Question_on_opp {
    public static void main(String[] args) {
        //problem 1
        Employee1 harry= new Employee1();
        harry.setName("Harry");
        harry.salary=223;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //problem 2
        cellphone asus=new cellphone();
        asus.callFriend();
        asus.ringing();
        asus.vibrate();
        //problem3
        Square sq=new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //problem 5
        Tomy pl=new Tomy();
        pl.fire();
        pl.run();
        pl.hit();



    }
}
*/
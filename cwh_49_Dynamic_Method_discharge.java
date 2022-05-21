class Phone {
    //super class ka refrence

    public void great() {
        System.out.println("Good Morning");

    }
    public void on(){
        System.out.println("Turning on Phone....!!");
    }

}
    class SmartPhone extends Phone{
    //sub class ka object
        public void swagat(){
            System.out.println("Ap Ka Swagat Hai");
        }
        public void on(){
            System.out.println("Turning on SmartPhone....!!");
        }
    }

public class cwh_49_Dynamic_Method_discharge {
    public static void main(String[] args) {
        //Phone obj=new Phone();
        Phone obj=new SmartPhone();

        obj.great();
        obj.on();

    }
}

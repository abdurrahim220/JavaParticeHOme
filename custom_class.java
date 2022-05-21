class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is = "+id);
        System.out.println("My name is = "+name);
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry= new Employee();//Instantiatin a new emplou object
        Employee john=new Employee();
        harry.id=12;
        harry.name="CodeWithHarry";

        john.id=17;
        john.name="Royal";
        harry.printDetails();

        john.printDetails();
       // System.out.println(harry.id);
       // System.out.println(harry.name);

    }
}

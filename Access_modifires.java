class MyEmploye{
    int id;
    String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Access_modifires {
    public static void main(String[] args) {
        MyEmploye ra=new MyEmploye();
       // ra.id=45;
       // ra.name="CodeWithHarry";
        //System.out.println(ra.name);
        ra.setName("Royal");
        System.out.println(ra.getName());
        ra.setId(234);
        System.out.println(ra.getId() );

    }
}

interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
    }

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling...!"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....!");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap...!");
    }
    public void recordVideo(){
        System.out.println("Recording Video..!");
    }
    public String [] getNetworks(){
        System.out.println("Getting List of Networks..!");
        String[] networkList={"Harry", "Royal", "Masuma"};
        return networkList;}
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class cwh_57_default_Metod {
    public static void main(String[] args) {
        MyCellPhone ns=new MySmartPhone();
        String[] ar= ns.getNetworks();;
        for(String item:ar){
            System.out.println(item);
        }
    }
}

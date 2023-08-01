interface camera{
    void takenap();
    void recordvid();
}
interface wifi{
    String[] getnet();
    void connect(String net);
}
class cellphone{
void call(){
    System.out.println("calling");
}
void pick(){
    System.out.println("picking");
}
}

class Smartphone extends cellphone implements
wifi,camera{
    public void takenap(){
        System.out.println("taking photo");
    }
    public void recordvid(){
        System.out.println("recording video");
    }
    public String[] getnet(){
        System.out.println("getting net");
        String[] arr = {"a","b","c"};
        return arr;
    }
    public void connect(String net){
        System.out.println("connecting to "+net);
    }
}




public class in{
    public static void main(String args[]){
     Smartphone s = new Smartphone();
    String arr[] = s.getnet();
    for(String item:arr){
        System.out.println(item);
    }
    }
}
    

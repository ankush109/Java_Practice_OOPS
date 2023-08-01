interface b{
    public void a();
    public void b();
}   
// inferace : - where some methdos are present and it should also be used where it is been implemented
class avon implements b{
    public void a(){
        System.out.println("I am in a");
    }
   public void b(){
        System.out.println("I am in b");
    }
}
// we cant change values in interface as they are final
// abstract classes can be used only one to be extends but interfaces can be many to be extended
public class ab{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}

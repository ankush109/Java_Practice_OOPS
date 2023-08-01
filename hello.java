 class Employe{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}
class MyEmployee {
    private int id;
    private String name;
    // constructor
    public MyEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
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
public class hello{
    public static void main(String[] args){
        MyEmployee harry = new MyEmployee();
        // harry.id = 12;
        // harry.name = "Harry";
        // harry.printDetails();
        
        // Square sq = new Square();
        // sq.side = 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());
        //harry.setName("ankush banerjee");
        System.out.println(harry.getName());
    }
}
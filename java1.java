import java.util.*;


class Cylinder{
    private int radius;
    private int height;
    // getter and setter for radius
    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
    // getter and setter for height
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return height;
    }

}
// inheritance
class Base {
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}
class derived extends Base {
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am in derived and setting y now");
        this.y = y;
    }

}
public class java1{
    public static void main(String[] args){
        System.out.println("Hello World");
        // Cylinder c = new Cylinder();
        // c.setRadius(5);
        // c.setHeight(10);
        // System.out.println(c.getRadius());
        // System.out.println(c.getHeight());

        // inheritance
        // derived b = new derived();
        // b.setX(4);
        // System.out.println(b.getX());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

    }
}
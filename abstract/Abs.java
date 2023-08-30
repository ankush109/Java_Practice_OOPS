abstract class Parent {
    public Parent() {
        System.out.println("i am a contructor of base 2");
    }

    abstract public void greet();
}

class derived extends Parent {

    public void greet() {
        System.out.println("Good Morning");
    }
}

public class Abs {
    public static void main(String[] args) {
        derived d = new derived();
        d.greet();
    }
}

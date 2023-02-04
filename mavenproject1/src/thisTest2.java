class App {
    App() {
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class thisTest2 extends App{
    thisTest2() {
        super(20); //calls constructor and parameterized constructor of base class
        System.out.println("Constructor of thisTest2");
    }
    public static void main(String[] args) {
        new thisTest2();
    }
}

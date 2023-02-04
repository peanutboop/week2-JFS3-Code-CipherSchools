public class thisTest1 {
    int arg=5;
    thisTest1() {
        System.out.println("Hi! I am default constructor");
    }
    thisTest1(int arg) {
        this();
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg= 10;
                thisTest1 obj= new thisTest1(10);
        System.out.println(obj.arg);
    }
}

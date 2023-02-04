import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class listSet {
    public static void main(String[] args) {
        HashSet xo= new HashSet();
        xo.add("green");
        xo.add("red");
        xo.add("orange");
        xo.add("red");
        xo.add("orange");

        System.out.println(xo);


        LinkedHashSet lxo= new LinkedHashSet();
        lxo.add("green");
        lxo.add("red");
        lxo.add("orange");
        lxo.add("red");
        lxo.add("orange");

        System.out.println(lxo);


        TreeSet txo= new TreeSet();                                 //TreeSet does not allow null
        txo.add("cat");
        txo.add("apple");
        txo.add("ball");
//        txo.add(null);

        System.out.println(txo);
    }
}

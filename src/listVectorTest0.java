import java.util.Iterator;
import java.util.Vector;
public class listVectorTest0 {
    public static void main(String[] args) {
        Vector v= new Vector();

        v.add("Texas");
        v.add("Zurich");
        v.add("NewYork");

        Iterator pointer= v.iterator();

        while(pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }
}

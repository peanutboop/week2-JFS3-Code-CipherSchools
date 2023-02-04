import java.util.Iterator;
import java.util.LinkedList;

public class linkedListTest0 {
    public static void main(String[] args) {
        LinkedList xo= new LinkedList();

        xo.add("Ironman");
        xo.add("Thor");
        xo.add("Hulk");
        xo.add("Loki");


        xo.addLast("Gamora");
        xo.addFirst("Antman");
        xo.add(2, "Natasha");


        System.out.println(xo);


        System.out.println("------------");
        System.out.println("Who's at the top "+ xo.peek());
        System.out.println("!st get out "+ xo.poll());
        System.out.println("The last one is "+ xo.pop());
        System.out.println("------------");

    }
}

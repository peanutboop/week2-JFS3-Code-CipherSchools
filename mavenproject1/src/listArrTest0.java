import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class listArrTest0 {
    public static void main(String[] args) {
        ArrayList<String> states= new ArrayList<String>();

        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("ArrayList : "+ states);


        String s= states.get(2);                                            //get() method
        System.out.println("I got " + s);


        System.out.println("ArrayList size " + states.size());              //size()

        /*
        for(int i=0: i<states.size(); i++) {
            System.out.println(states.get(i));
        } */


        states.set(2, "Texas");                                             // set() method
        System.out.println("Updated State : " +states);


        String t= states.remove(3);                                    //remove() method
        System.out.println("State removes :" + t);
        System.out.println("Array after deletion :" + states);


        states.sort(Comparator.naturalOrder());                             //sort() method
        System.out.println("Array after sorting :" + states);


        System.out.println("New York?" + states.contains("newyork"));      //contains() method


        System.out.println("Empty Array list?" + states.isEmpty());        //isEmpty() method
        states.removeAll(states);
        System.out.println("Empty Array list?" + states.isEmpty());

    }
}

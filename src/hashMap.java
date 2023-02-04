import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> states= new HashMap<String, String>();

        states.put("Tx","Texas");                                   //put() method
        states.put("Al","Alabama");
        states.put("Ar","Arizona");
        states.put("Ca","Cali");

        System.out.println(states);

        for(Map.Entry<String, String> e : states.entrySet()) {
            System.out.println(e.getKey() + "----" + e.getValue());
        }
    }
}

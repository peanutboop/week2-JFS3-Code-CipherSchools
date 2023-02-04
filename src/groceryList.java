import java.util.ArrayList;
import java.util.Scanner;
public class groceryList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList xo= new ArrayList();
        for(int i=1; i<=5; i++) {

            String item= sc.next();
            if(xo.contains(item)){
                continue;
            }
            xo.add(item);
        }
        System.out.println(xo);
    }
}

import java.io.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class readingFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/Users/ishan/OneDrive/Desktop/pokemon.csv");

        BufferedReader br = new BufferedReader(fr);
        String  line;

        ArrayList<String> Pokemons = new ArrayList<>();

        while((line= br.readLine()) != null){
            Pokemons.add(line);

        }
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        HashSet ptypes = new LinkedHashSet();

        if (ptypes.contains(type)) {
            System.out.println("Invalid Pokemon type");
            return;

        }
        for(String pok : Pokemons) {
            String ptype = pok.split(",")[1];

        }
    }
}
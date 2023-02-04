import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readingFile0 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Users/ishan/OneDrive/Desktop/pokemon.csv");

        BufferedReader br = new BufferedReader(fr);
        String  line;

        ArrayList<String> Pokemons = new ArrayList<String>();

        br.readLine();


        while((line= br.readLine()) != null) {


            Pokemons.add(line);

        }
        System.out.println("Total Pokemons " + Pokemons.size());

        ArrayList<String> pokemonTitle = new ArrayList<String>();

        for(String pok : Pokemons) {
            String title = pok.split(",")[0];
            pokemonTitle.add(title);

        }
        System.out.println(pokemonTitle);


    }
}
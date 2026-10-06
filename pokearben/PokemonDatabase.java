// Lets us use arrays
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonDatabase{

    private ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public void loadDatabase(String filePath) {
        
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // We need to skip the first line with all of the column names
            scanner.nextLine();

            while(scanner.hasNextLine()) {

                String line = scanner.nextLine();

                // String array. Turns it from like one line
                // 1,Bulbasaur,Grass
                // to
                // data[0] = "1"
                // data[1] = "Bulbasaur"

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String type1 = data[2];
                String type2 = data[3];
                
                int hp = Integer.parseInt(data[4]);
                int attack = Integer.parseInt(data[5]);
                int defense = Integer.parseInt(data[6]);
                int specialAttack = Integer.parseInt(data[7]);
                int specialDefense = Integer.parseInt(data[8]);
                int speed = Integer.parseInt(data[9]);

                Pokemon pokemon = new Pokemon(
                    id,
                    name,
                    type1,
                    type2,
                    hp,
                    attack,
                    defense,
                    specialAttack,
                    specialDefense,
                    speed
                );

                pokemonList.add(pokemon);

            }

            // Done with the file and can close it now.
            scanner.close();
            System.out.println("Finished Loading " + pokemonList.size() + " Pokemon");

    } catch(FileNotFoundException e) {
        System.out.println("File could not be found.");
    }


} 
}
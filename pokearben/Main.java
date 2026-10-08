import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        PokemonDatabase database = new PokemonDatabase();

        database.loadDatabase("data/pokemon.csv");
        System.out.print("Choose how to get a pokemon. 1 for Name, 2 for ID, 3 for typing: ");
        String chooseOption0 = scanner.nextLine();
        int chooseOption = Integer.parseInt(chooseOption0); 
    
    if (chooseOption == 1) {
        System.out.print("Enter a pokemon name: ");
        String chosenPokemon = scanner.nextLine().toLowerCase();
        } else if (chooseOption == 2) {
              System.out.print("Enter a pokemon ID: ");
              String chosenPokemon = scanner.nextLine();
              int chosenPokemonID = Integer.parseInt(chosenPokemon);
        } 
        

        ArrayList<Pokemon> results = database.searchByName(chosenPokemon);
        if (results.isEmpty()) {
            ArrayList<Pokemon> results = database.searchByID(chosenPokemonID);
                if (results.isEmpty()) {
                    System.out.println("No Pokemon found.");
                } else {
                    for (Pokemon p : results)
                    p.getInfo();
                }

        } else {

            for (Pokemon p : results) {
                p.getInfo();
            }
        }
    }
}



import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        PokemonDatabase database = new PokemonDatabase();
        Team team = new Team();

        database.loadDatabase("data.pokemon.csv");

        boolean buildingTeam = true;

        while (buildingTeam & team.getSize() < 6) {

            System.out.println("Pokearben Team Bulder: ");
            System.out.println("1. Search by Name");
            System.out.println("2. Search by ID");
            System.out.println("3. View Team");
            System.out.println("4. Finish Building Team");
            System.out.println("Choose an option above by typing the corresponding number");

            int chooseOption = Integer.parseInt(scanner.nextLine());

            if (chooseOption == 1) {
                
                System.out.println("Enter a Pokemon name: ");
                String chosenName = scanner.nextLine();

                ArrayList<Pokemon> results = database.searchByName(chosenName);

                if (results.isEmpty()) {
                    System.out.println("No Pokemon found.");
                } else if (results.size() == 1) {

                    Pokemon chosenPokemon = results.get(0);
                    chosenPokemon.getInfo();

                    System.out.println("Add this Pokemon to your team?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("Choose an option above by typing the corresponding number");

                    int addChoice = Integer.parseInt(scanner.nextLine());

                    if (addChoice == 1) {
                        team.addPokemon(chosenPokemon);
                    }

                } else {

                    System.out.println("Multiple Pokemon found: ");
                    for (Pokemon pokemon : results) {
                        pokemon.getInfo();
                    }

                     System.out.println("Search with a more specific name.");
                }
            } else if (chooseOption == 2) {

                System.out.println("Enter a Pokemon ID: ");
                int chosenID = Integer.parseInt(scanner.nextLine());

                Pokemon chosenPokemon = database.getPokemonByID(chosenID);

                if (chosenPokemon != null) {

                    chosenPokemon.getInfo();

                    System.out.println("Add this Pokemon to your team?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("Choose an option above by typing the corresponding number");

                    int addChoice = Integer.parseInt(scanner.nextLine());

                    if (addChoice == 1) {
                        team.addPokemon(chosenPokemon);
                    }
                } else {

                    System.out.println("No Pokemon found with that ID.");
                }
           } else if (chooseOption == 3) {

            team.displayTeam();
           } else if (chooseOption == 4) {

            buildingTeam = false;
           } else {

            System.out.println("Invalid option selected.");
           }
        }
            System.out.println("Final Team: ");
            team.displayTeam();
            scanner.close();
    }

} 

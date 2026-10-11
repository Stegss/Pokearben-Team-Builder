import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        PokemonDatabase database = new PokemonDatabase();
        Team team = new Team();

        database.loadDatabase("data/pokemon.csv");

        boolean buildingTeam = true;

        while (buildingTeam) {

            System.out.println("Pokearben Team Bulder: ");
            System.out.println("1. Search by Name");
            System.out.println("2. Search by ID");
            System.out.println("3. View Team");
            System.out.println("4. Remove Pokemon");
            System.out.println("5. Customize Pokemon");
            System.out.println("6. Finish Building Team");
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

            team.displayTeam();

            if (team.getSize() > 0) {

                System.out.println("Enter the team position to remove. (1 -" + team.getSize() + "): ");

                int position = Integer.parseInt(scanner.nextLine());

                team.removePokemon(position);
            }
           } else if (chooseOption == 5) {

            team.displayTeam();

            if (team.getSize() > 0) {
                System.out.println("Which team slot do you want to customize?");

                int position = Integer.parseInt(scanner.nextLine());

                Pokemon chosenPokemon = team.getPokemon(position);

                if (chosenPokemon != null) {
                    customizePokemon(chosenPokemon, scanner);
                } else {
                    System.out.println("Invalid team position.");
                }
            }
           } else if (chooseOption == 6) {

            buildingTeam = false;
           } else {

            System.out.println("Invalid option selected.");
           }
        }
            System.out.println("Final Team: "); // This line looks a little odd in execution
            team.displayTeam();
            scanner.close();
    }

    public static void customizePokemon(Pokemon pokemon, Scanner scanner) {

        boolean customizing = true;

        while (customizing) {

            System.out.println("\nCustomize: " + pokemon.getName().toUpperCase());
            System.out.println("1. Change IV");
            System.out.println("2. Change EV");
            System.out.println("3. Change Nature");
            System.out.println("4. Change Ability");
            System.out.println("5. Change Held Item");
            System.out.println("6. Change Move");
            System.out.println("7. View Current Build");
            System.out.println("8. Return to Main Menu");
            System.out.println("Choose an option above by typing the corresponding number");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1 || choice == 2) {

                System.out.println("Enter stat (HP, Attack, Defense, Special Attack, Special Defense, Speed): ");
                String stat = scanner.nextLine();

                System.out.println("Enter value: ");
                int value = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    pokemon.setIV(stat, value);
                } else {
                    pokemon.setEV(stat, value);
                }
            } else if (choice == 3) {

                System.out.println("Enter Nature: ");
                pokemon.setNature(scanner.nextLine());

            } else if (choice == 4) {

                System.out.println("Enter Ability: ");
                pokemon.setAbility(scanner.nextLine());

            } else if (choice == 5) {

                System.out.println("Enter Held Item: ");
                pokemon.setHeldItem(scanner.nextLine());
            } else if (choice == 6) {

                System.out.print("Choose move slot (1-4): ");
                int slot = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Move Name: ");
                String move = scanner.nextLine();

                pokemon.setMove(slot, move);

            } else if (choice == 7 ) {

                pokemon.displayBuild();

            } else if (choice == 8) {

                customizing = false;

            } else {

                System.out.println("Invalid option.");
                
            }
        }
    }
} 

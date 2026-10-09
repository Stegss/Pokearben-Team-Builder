import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        PokemonDatabase database = new PokemonDatabase();

        database.loadDatabase("data/pokemon.csv");
        
        System.out.print("Choose how to get a pokemon. 1 for Name, 2 for ID: ");
        int chooseOption = Integer.parseInt(scanner.nextLine());

        ArrayList<Pokemon> results = new ArrayList<>();
    
        if (chooseOption == 1) {
            System.out.print("Enter a pokemon name: ");
            String chosenName = scanner.nextLine().toLowerCase();
            results = database.searchByName(chosenName);
        
        } else if (chooseOption == 2) {
              System.out.print("Enter a pokemon ID: ");
              int chosenID = Integer.parseInt(scanner.nextLine());
              results = database.searchByID(chosenID);

        } else {
            System.out.print("Invalid option selected.");
            return;
        }
        results.getInfo();
        
        // 1 (Search by Name) or 2 (Search by ID)
        // Shows Pokemon Stats
        // Add this pokemon to team? [Y/N]
        // Prompted to add another (1) or to edit team (2)
        // Add another goes back up to the top, edit team allows you to choose who
        // Once you choose, you can edit EVs, IVs, etc.
        // Allow them to exit whenever.
        // Rinse and repeat until the team is full with 6 party members.
        // Also, always allow them to save the team.

        

        // Add a new team member? [tba]
        
        // Edit Options:
        // Change nature? natures.(put nature here)
        // Change EVs? evTrain.(amount)(stat)
        // Change IVs? changeIV (tba)
        }
}




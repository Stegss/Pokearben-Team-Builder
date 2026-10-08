import java.util.ArrayList;

public class Team {
    
    private ArrayList<Pokemon> team = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        if (team.size() < 6) {
            team.add(pokemon);
            System.out.println(pokemon + " was added to your team.");
        } else {
            System.out.println("Sorry, your team is full with 6 Pokemon.");
        }
    }

    public void displayTeam() {
        System.out.println("Your Team: ");
        for (Pokemon pokemon : team) {
            System.out.println("- " + pokemon.getName());
        }

    }
}

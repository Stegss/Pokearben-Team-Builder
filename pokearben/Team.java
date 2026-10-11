import java.util.ArrayList;

public class Team {
    
    private ArrayList<Pokemon> team = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        if (team.size() < 6) {
            team.add(pokemon);
            System.out.println(pokemon.getName() + " was added to your team.");
        } else {
            System.out.println("Sorry, your team is full with 6 Pokemon.");
        }
    }

    public void displayTeam() {
        System.out.println("Your Team: ");

        if (team.isEmpty()) {
            System.out.println("Your team is currently empty.");
        } 

        for (int i = 0; i < 6; i++) {

            System.out.println("\n--- Slot " + (i + 1) + " ---");

            if (i < team.size()) {

                Pokemon pokemon = team.get(i);
                pokemon.getInfo();
            } else {

                System.out.println("Empty Slot");
            }
        }
    }

    public void removePokemon(int position) {

        if (position >= 1 && position <= team.size()) {

            Pokemon removedPokemon = team.remove(position - 1);

            System.out.println(removedPokemon.getName() + "was removed from your team.");
        } else {
            System.out.println("That is an invalid team position.");
        }
    }

    public int getSize() {
        return team.size();
    }

    public Pokemon getPokemon(int position) {
        if (position >= 1 && position <= team.size()) {
            return team.get(position - 1);
        }
        return null;
    }
    

}

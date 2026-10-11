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
        } else {
            for (int i = 0;
                i < team.size();
                i++) {
                    System.out.println((i + 1) + "." + team.get(i).getName());
                }
        }
    }

    AAA



    public int getSize() {
        return team.size();
    }
    

}

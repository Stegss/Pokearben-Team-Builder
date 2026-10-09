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
        for (Pokemon pokemon : team) {
            System.out.println("- " + pokemon.getName());
        }

    }
    // int globalEvs = 508;
    //
    // public void evTrain(int ev, String stat) {
    // globalEvs -= ev
    // if (globalEvs =< 0){
    // System.out.println("You don't have enough EVs for that. Current EV Amount: "+ String.valueOf(globalEvs))
    // }
    // if (ev > 252) {
    // System.out.println("Invalid amount of EV investment")
    // }
    // this.stat = Pokemon.stat
    // stat += (stat+(ev/4))
    // Pokemon.stat = stat
    // ts does NOT work gng
    // }
    //
    //
    // 
    //
    // public void natures(String nature) {
    // if (nature = "Lonely" || nature = "Adamant" || nature = "Naughty" || nature = "Brave") {
    //      pokemon.attack = 1.1(pokemon.attack);
    // }
    // if (nature = "Bold" || nature = "Impish" || nature = "Lax" || nature = "Relaxed") {
    //      pokemon.defense = 1.1(pokemon.defense);
    // }
    // if (nature = "Modest" || nature = "Mild" || nature = "Rash" || nature = "Quiet") {
    //      pokemon.specialAttack = 1.1(pokemon.specialAttack);
    // }
    // if (nature = "Calm" || nature = "Gentle" || nature = "Careful" || nature = "Sassy") {
    //      pokemon.specialDefense = 1.1(pokemon.specialDefense);
    // }
    // if (nature = "Timid" || nature = "Hasty" || nature = "Gentle" || nature = "Naive") {
    //      pokemon.speed = 1.1(pokemon.speed);
    // }
}

public class Main {

    public static void main(String[] args){

        PokemonDatabase database = new PokemonDatabase();

        database.loadDatabase("data/pokemon.csv");

    }
}

// Next need to add a way to like search for the Pokemon you want.
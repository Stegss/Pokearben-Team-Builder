
public class Main {

    public static void main(String[] args){

        PokemonDatabase database = new PokemonDatabase();

        database.loadDatabase("data/pokemon.csv");
        // 
       
//         ArrayList<Pokemon> results = database.searchByName("Pikachu");
//         if (results.isEmpty()) {

//     System.out.println("No Pokemon found.");

//         } else {
    
//         for (Pokemon p : results) {
//         p.getInfo(); 
//     }
// }

    }
}



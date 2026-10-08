
public class Pokemon {

    private int id;
    private String name;
    private String type1;
    private String type2;

    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;


public Pokemon(
    int id,
    String name,
    String type1,
    String type2,
    int hp,
    int attack,
    int defense,
    int specialAttack,
    int specialDefense,
    int speed ) {

        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        
    }

    public void getInfo() {
        System.out.println(" ");
        System.out.println("#" + id + " " + name);
        if(type2.isEmpty()) {
            System.out.println("Type: " + type1);
        } else {
            System.out.println("Type: " + type1 + " and " + type2);
        }

        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Sp. Attack: " + specialAttack);
        System.out.println("Sp. Defense: " + specialDefense);
        System.out.println("Speed: " + speed);
        System.out.println(" "); }

    public String getName() {
        return name;
    }
    public int getID() {
        return id;
    }
}



 

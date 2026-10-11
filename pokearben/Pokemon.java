
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

    // Individual Values (IVs)
    private int hpIV = 31;
    private int attackIV = 31;
    private int defenseIV = 31;
    private int specialAttackIV = 31;
    private int specialDefenseIV = 31;
    private int speedIV = 31;

    // Effort Values (EVs)
    private int hpEV = 0;
    private int attackEV = 0;
    private int defenseEV = 0;
    private int specialAttackEV = 0;
    private int specialDefenseEV = 0;
    private int speedEV = 0;

    // More customization
    private String nature = "Hardy";
    private String ability = "";
    private String heldItem = "";

    // Four move slots
    private String[] moves = {"", "", "", ""};


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

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public void setIV(String stat, int value) {

        if (value < 0 || value > 31) {
            System.out.println("IV must be between 0 and 31.");
            return;
        }

        if (stat.equalsIgnoreCase("HP")) {
            hpIV = value;
        } else if (stat.equalsIgnoreCase("Attack")) {
            attackIV = value;
        } else if (stat.equalsIgnoreCase("Defense")) {
            defenseIV = value;
        } else if (stat.equalsIgnoreCase("Special Attack")) {
            specialAttackIV = value;
        } else if (stat.equalsIgnoreCase("Special Defense")) {
            specialDefenseIV = value;
        } else if (stat.equalsIgnoreCase("Speed")) {
        speedIV = value;
    } else {
        System.out.println("No such stat name.");
        return;
    }
    
    System.out.println(stat + " IV set to " + value + ".");
}

    public void setEV(String stat, int value) {

        if (value < 0 || value > 252) {
            System.out.println("IV must be between 0 and 252.");
            return;
        } 

        int currentEV = 0;

        if (stat.equalsIgnoreCase("HP")) {
            currentEV = hpEV;
        } else if (stat.equalsIgnoreCase("Attack")) {
            currentEV = attackEV;
        } else if (stat.equalsIgnoreCase("Defense")) {
            currentEV = defenseEV;
        } else if (stat.equalsIgnoreCase("Special Attack")) {
            currentEV = specialAttackEV;
        } else if (stat.equalsIgnoreCase("Special Defense")) {
            currentEV = specialDefenseEV;
        } else if (stat.equalsIgnoreCase("Speed")) {
            currentEV = speedEV;
        } else {
            System.out.println("Invalid stat name.");
            return;
        }

        int totalEV = hpEV + attackEV + defenseEV + specialAttackEV + specialDefenseEV + speedEV;

        if (totalEV - currentEV + value > 510) {
            System.out.println("Your Pokemon cannot have more than 510 EVs in total.");
            return;
        }

        if (stat.equalsIgnoreCase("HP")) {
            hpEV = value;
        } else if (stat.equalsIgnoreCase("Attack")) {
            attackEV = value;
        } else if (stat.equalsIgnoreCase("Defense")) {
            defenseEV = value;
        } else if (stat.equalsIgnoreCase("Special Attack")) {
            specialAttackEV = value;
        } else if (stat.equalsIgnoreCase("Special Defense")) {
            specialDefenseEV = value;
        } else if (stat.equalsIgnoreCase("Speed")) {
        speedEV = value;
    } 
    
    System.out.println(stat + " EV set to " + value + ".");
}

    public void setNature(String nature) {
        this.nature = nature;
        System.out.println("Nature set to " + nature + " .");
    }

    public void setAbility(String ability) {
        this.ability = ability;
        System.out.println("Ability to " + ability + ".");
    }

    public void setHeldItem(String heldItem) {
        this.heldItem = heldItem;
        System.out.println("Held item set to " + heldItem + ".");
    }

    public void setMove(int slot, String move) {
        if (slot >= 1 && slot <= 4) {
            moves[slot - 1] = move;
            System.out.println("Move " + slot + " set to " + move + ".");
        } else {
            System.out.println("The move slot must be between 1 and 4.");
        }
    }

    public void displayBuild() {
        System.out.println("\n--- Competitive Build ---");
        System.out.println("Nature: " + nature);
        System.out.println("Ability: " + ability);
        System.out.println("Held Item: " + heldItem);

        System.out.println("\nIVs:");
        System.out.println("HP: " + hpIV + " | Attack: " + attackIV + " | Defense: " + defenseIV);
        System.out.println("Sp. Attack: " + specialAttackIV + " | Sp. Defense: " + specialDefenseIV + " | Speed: " + speedIV);

        System.out.println("\nEVs:");
        System.out.println("HP: " + hpEV + " | Attack: " + attackEV + " | Defense: " + defenseEV);
        System.out.println("Sp. Attack: " + specialAttackEV + " | Sp. Defense: " + specialDefenseEV + " | Speed: " + speedEV);

        System.out.println("\nMoves:");
        for (int i = 0; i < 4; i++) {
            if (moves[i].isEmpty()) {
                System.out.println((i+1) + ". Empty");
            } else {
                System.out.println((i + 1) + ". " + moves[i]);
            }
        }
    }

}



 

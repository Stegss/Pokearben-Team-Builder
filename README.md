# Pokearben-Team-Builder

Pokearben Team Builder is a simple Pokemon team builder that can help players develop a
team to use in the mainline Pokemon games or even the competitive Pokemon Champions.

## 🚀 Features

- **Feature 1**: Add Pokemon by Name or ID to your team.
- **Feature 2**: Get a detailed view of your team.
- **Feature 3**: Remove Pokemon from your team.
- **Feature 4**: Customize each Pokemon.

## 🛠️ Customization

The following are quick and easy to change to get down into the nitty gritty of your team. 

- **IVs and EVs** 
- **Nature** 
- **Ability**
- **Held Item**
- **Moves**

*A note for IVs and EVs: IVs can only reach a max of 16 per stat, and EVs can only reach max of 252 per stat, 510 total. The IV method accounts for this by checking if the entered value is below 0 or above 31. The EV method accounts for this by checking if the entered value is below 0 or above 252, and checking if the total EVS (HP+atk+def, etc) are above 510, in which the change will fail.*

## 📦 Prerequisites

Before installing the project, make sure you have the following installed:

- **A Java Virtual Machine (JVM)**

## ⌨️ Code Explanation

  The way that this code works is by creating objects in the Pokemon class first, which sets up the base stats and typing of the Pokemon. This data is from the Pokemon.csv dataset, which is read by a scanner. The scanner parses at each comma, which is the separation of different pieces of data in the set. From there, it IDs each set to grab the needed stat. For example, data[2] would be the HP because the third piece of data corresponds to the pokemon's HP.
  
  The Pokemon themselves are gotten with 1. Search by Name or 2. Search by ID, which once again uses the scanner to read the next line (the user's input) and compares it to the name from the database we found prior. Those are set as matches, which are then returned to the main to get info (a method that prints the basic necessities of your Pokemon). If there are multiple matches, the program will prompt you to be more specific (example: "Chu" for both "Pikachu" and "Raichu"). It works in the same way for ID and Name, except ID must use parseInt to convert the input to an integer.
  
  Your Pokemon team is stored in an Arraylist of the team class, which can print and alter Pokemon when prompted. Team is stored in Team.java. it checks for the length of the list, the size, which cannot be over 6 in a Pokemon team. That is also what lets it focus in on a specific Pokemon, using a specific element of the list, based on a user input from the scanner which is parsed and made a position.
  
  There is also a boolean, buildingTeam, which stops the first section of the code from running once 6 (stop building team) is selected. The same goes for customizing in the next section.
  
  The customization gives you many options for building a Pokemon, plus a 'go back to main menu' that sets customizing to false and sends you back to the team building. IVs and EVs are fairly simple: The user chooses a stat and integer with the scanner, and then the setIV/setEV method is called for the chosen Pokemon, using the input to change the stats. The nature, ability and held item is easy, it just reads input as a string. Finally, the move slot first asks you which move you want to change, then grabs the user's input as a String to input into a method that changes or sets the move. displayBuild simply displays the variables of your Pokemon.

## 🎮 Application

Pokearben Team Builder primarily supports the main series Pokémon games, which feature the traditional turn-based combat system.
Here is the clean, comprehensive list of all main series games that use this turn-based combat engine, grouped by generation:

**Generation I (Kanto)**

• Pokémon Red
• Pokémon Blue
• Pokémon Yellow

**Generation II (Johto)**

• Pokémon Gold
• Pokémon Silver
• Pokémon Crystal

**Generation III (Hoenn & Kanto)**

• Pokémon Ruby
• Pokémon Sapphire
• Pokémon FireRed
• Pokémon LeafGreen
• Pokémon Emerald

**Generation IV (Sinnoh & Johto)**

• Pokémon Diamond
• Pokémon Pearl
• Pokémon Platinum
• Pokémon HeartGold
• Pokémon SoulSilver

**Generation V (Unova)**

• Pokémon Black
• Pokémon White
• Pokémon Black 2
• Pokémon White 2

**Generation VI (Kalos & Hoenn)**

• Pokémon X
• Pokémon Y
• Pokémon Omega Ruby
• Pokémon Alpha Sapphire

**Generation VII (Alola & Kanto)**

• Pokémon Sun
• Pokémon Moon
• Pokémon Ultra Sun
• Pokémon Ultra Moon
• Pokémon: Let's Go, Pikachu!
• Pokémon: Let's Go, Eevee!

**Generation VIII (Galar, Sinnoh & Hisui)**

• Pokémon Sword
• Pokémon Shield
• Pokémon Brilliant Diamond
• Pokémon Shining Pearl
• Pokémon Legends: Arceus

**Generation IX (Paldea & Kitakami/Unova)**

• Pokémon Scarlet
• Pokémon Violet


import java.util.Scanner;

public class Character {
   String name;
   int level;
   int agility;

   public Character(String var1, int var2, int var3) {
      this.name = var1;
      this.level = var2;
      this.agility = var3;
   }

   public void displayCharacterInfo() {
      System.out.println("Name: " + this.name);
      System.out.println("Level: " + this.level);
      System.out.println("Agility: " + this.agility);
  }

      public static Character createCharacter() {
         try (Scanner var0 = new Scanner(System.in)) {
         System.out.print("Enter character's name: ");
         String var1 = var0.nextLine();
         System.out.print("Enter character's level: ");
         int var2 = var0.nextInt();
         System.out.print("Enter character's agility: ");
         int var3 = var0.nextInt();
         Character character = new Character(var1, var2, var3);
         var0.close();
         return character;
      }
   }
   public static void main(String[] args) {
      Character myCharacter = Character.createCharacter();
      myCharacter.displayCharacterInfo();
   }
}
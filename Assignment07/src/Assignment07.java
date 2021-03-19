import java.util.Scanner;

public class Assignment07 {
   private static Scanner scnr = new Scanner(System.in);
   
    public static void main(String[] args) {
        // instantiate Weapon objects
        Weapon weapon1 = new Weapon("Atomic Fire Breath", 70);
        Weapon weapon2 = new Weapon("Fireball", 50);
        Weapon weapon4 = new Weapon("Body Slam", 50);
        // instantiate Character objects
        Monster monster1 = new Monster("Bowser", 200, weapon1);
        Monster monster2 = new Monster("Mario", 200, weapon2);
        Monster monster3 = new Monster("Luigi", 200, weapon2);
        Monster monster4 = new Monster("Kirby", 200, weapon2);
        // declare variables that track the game's battles and rounds. Sets the stage for round 1 of the battle
        int round = 1;
        int battle = 1;
        // battle continues in rounds until one (or both ) monsters have a health that is <= 0
        while (monster1.getHealthScore() > 0 && monster2.getHealthScore() > 0) {
        	// first monster attacks second monster
            int damage1 = monster1.attack(monster2);
            // second monster attacks first monster
            int damage2 = monster2.attack(monster1);
            // this prints the results for the current round
            System.out.println("========================================");
            System.out.println("===========Super Smash Bros.============");
            System.out.println("========================================");
            System.out.println("Battle " + battle);
            System.out.println("Round " + round);
            System.out.println("----------------------------------------");
            
            System.out.println(monster1.getName() + " attacks " + monster2.getName() + 
                               " with " + monster1.getWeaponName() + 
                               ", doing " + damage1 + " points of damage.");
            System.out.println(monster2.getName() + " attacks " + monster1.getName() + 
                               " with " + monster2.getWeaponName() + 
                               ", doing " + damage2 + " points of damage.");
            System.out.println("----------------------------------------");
            System.out.println(monster1.getName() + " Health = " + monster1.getHealthScore());
            System.out.println(monster2.getName() + " Health = " + monster2.getHealthScore());
            // this prints a prompt for the user to continue to the next round of the battle
            System.out.print("\nPress ENTER to continue...");
            scnr.nextLine();
            // this increments the variable keeping track of the current round by 1
            round += 1; 
        }
        // the while loop statements end because one (or both ) monster have a health the is <= 0
        
        // this code determines the winner of the round
        String winner1 = "No Monster";
       
        if (monster1.getHealthScore() > 0) {
               winner1 = monster1.getName();
        }
        if (monster2.getHealthScore() > 0) {
               winner1 = monster2.getName();
        }
        // print the winner of the round
        System.out.println("The winner is " + winner1 + "!");
        scnr.nextLine();
        
        
        // momster1 wins and progresses to Battle 2 //
        
        if (winner1 == monster1.getName()) {
        	monster1.resetHealthScore(monster1);
        	int battleTwoRound = 1;
            int battle2 = 2;
            // battle continues in rounds until one (or both ) monster have a health the is <= 0
            while (monster1.getHealthScore() > 0 && monster3.getHealthScore() > 0) {
            	// first monster attacks second monster
                int damage1 = monster1.attack(monster3);
                // second monster attacks first monster
                int damage2 = monster3.attack(monster1);
                // report the results for this round
                System.out.println("========================================");
                System.out.println("===========Super Smash Bros.============");
                System.out.println("========================================");
                System.out.println("Battle " + battle2);
                System.out.println("Round " + battleTwoRound);
                System.out.println("----------------------------------------");
                
                System.out.println(monster1.getName() + " attacks " + monster3.getName() + 
                                   " with " + monster1.getWeaponName() + 
                                   ", doing " + damage1 + " points of damage.");
                System.out.println(monster3.getName() + " attacks " + monster1.getName() + 
                                   " with " + monster3.getWeaponName() + 
                                   ", doing " + damage2 + " points of damage.");
                System.out.println("----------------------------------------");
                System.out.println(monster1.getName() + " Health = " + monster1.getHealthScore());
                System.out.println(monster3.getName() + " Health = " + monster3.getHealthScore());
                // pause before advancing to the next round
                System.out.print("\nPress ENTER to continue...");
                scnr.nextLine();
                // advance to the next round
                battleTwoRound += 1; 
            }
            // we made it out of the loop because one (or both ) monster have a health the is <= 0
            // now we must determine the winner (if there is one)
            String winner2 = "No Monster";
           
            if (monster1.getHealthScore() > 0) {
                   winner2 = monster1.getName();
            }
            if (monster3.getHealthScore() > 0) {
                   winner2 = monster3.getName();
            }
            // report the winner
            System.out.println("The winner is " + winner2 + "!");
        }    
            
          // monster2 wins and progresses to Battle 2 //
            
          else if (winner1 == monster2.getName()) {
        	int battleTwoRound = 1;
            int battle2 = 2;
            // battle continues in rounds until one (or both ) monster have a health the is <= 0
            while (monster2.getHealthScore() > 0 && monster3.getHealthScore() > 0) {
            	// first monster attacks second monster
                int damage1 = monster2.attack(monster3);
                // second monster attacks first monster
                int damage2 = monster3.attack(monster2);
                // report the results for this round
                System.out.println("========================================");
                System.out.println("===========Super Smash Bros.============");
                System.out.println("========================================");
                System.out.println("Battle " + battle2);
                System.out.println("Round " + battleTwoRound);
                System.out.println("----------------------------------------");
                
                System.out.println(monster2.getName() + " attacks " + monster3.getName() + 
                                   " with " + monster2.getWeaponName() + 
                                   ", doing " + damage1 + " points of damage.");
                
                System.out.println(monster3.getName() + " attacks " + monster2.getName() + 
                                   " with " + monster3.getWeaponName() + 
                                   ", doing " + damage2 + " points of damage.");
                System.out.println("----------------------------------------");
                System.out.println(monster2.getName() + " Health = " + monster2.getHealthScore());
                System.out.println(monster3.getName() + " Health = " + monster3.getHealthScore());
                // pause before advancing to the next round
                System.out.print("\nPress ENTER to continue...");
                scnr.nextLine();
                // advance to the next round
                battleTwoRound += 1; 
            }
            // we made it out of the loop because one (or both ) monster have a health the is <= 0
            // now we must determine the winner (if there is one)
            String winner2 = "No Monster";
           
            if (monster2.getHealthScore() > 0) {
                   winner2 = monster2.getName();
            }
            if (monster3.getHealthScore() > 0) {
                   winner2 = monster3.getName();
            }
            // report the winner
            System.out.println("The winner is " + winner2 + "!");
        }
    }
}


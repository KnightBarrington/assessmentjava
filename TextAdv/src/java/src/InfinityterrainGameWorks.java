
import java.util.Scanner;
import java.util.Random;

public class InfinityterrainGameWorks {
public static void main(String []args) {
		
		// system objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
//		
		// Game variables
		
		String[] enemies = {"Skeleton","Zombie","Warrior","Assassin"};
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 50;
		
		
		// player variables
		
		
		int health = 100;
		int attackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 40;
		int healthpotiondropchance = 60;
		
		
		boolean sprinting = true;
		
		System.out.println("Welcome To The Infinte--------- Blind Man's Swamp....... Battle Arena!!!!, Lets Get it!!----------------------------");
		
		
		GAME:
			while (sprinting) {
			System.out.println("--------Warning!......----- A Thick Fog Blocks your Vision,  You cant see anything.---- Warning!........--- Be Careful...-----------------------------------------------");
		
		
		int enemyHealth = rand.nextInt(maxEnemyHealth);
		String enemy = enemies [rand.nextInt(enemies.length)];
		
		System.out.println("\t# " + enemy + " Blocks your Path! #\n");  //grabs the enemy to the player.\n moves to next line
		// # skeleton has appeared !
		
		while(enemyHealth > 0) {
			System.out.println("Your Heros HP: " + health + "% ");
			System.out.println(enemy + "'s HP: " + enemyHealth + "% " );
			System.out.println("\n What Would You Like To Do Now....?????");
			System.out.println(" 1. Attack");
			System.out.println(" 2. Drink Health Potion");
			System.out.println(" 3. Run...for Your Life, We outta Here, Bye!!!!");
			System.out.println(" 4. Go North");
			System.out.println(" 5. Travel East ");
			System.out.println(" 6. Ride West");
			System.out.println(" 7. Go South");
			
		
			
			String input = in.nextLine();
			if(input.contentEquals("1")) {
			int damageDealt = rand.nextInt(attackDamage);
			int damageReceieved = rand.nextInt(enemyAttackDamage);
			
			
			enemyHealth -= damageDealt;
			health -= damageReceieved;
			
			System.out.println("You Strike the " + enemy + " for " + damageDealt + "% Damage");
			System.out.println("You Receieve " + damageReceieved + "% Damage in retaliation!! ohhh Noo!");
			
			if (health<1) {
				System.out.println(" You have sustained Critical Damage, You are too soft to continue battling, you can no longer proceed Further.. Damnnn!");
				break;
			}
			
		}
				else if (input.contentEquals("2")) {
					if(numHealthPotions > 0) {
					int healthPotionsHealAmount = 40;
					
					health += healthPotionsHealAmount;
					numHealthPotions --;
					
					System.out.println("You Chug a health potion, healing youself for " + healthPotionHealAmount + " %." + " You now have " + health + " % HP" );
				
					System.out.println("You Now have " + numHealthPotions + " health potions left.");
				}
				
					else {
						System.out.println("You have Zero health potions left!! Defeat enemies for a chance to get one ASAP!");
				}
				
			}		
				
				else if (input.contentEquals("3")) {
				
				System.out.println("You have Ran away from the " + enemy + " Like a Cowardly Dog ahaha, You have Survived this encounter, I dont think you will be as Lucky?! next time ");
				System.out.println("---------------------------------------------------------------------------------------");
				continue; 
		}
			
			else if (input.contentEquals("4")){
				System.out.println("You Venture North, deeper into the Fog......10 paces, from your next clue");
			}
			else if (input.contentEquals("5")) {
				System.out.println("You Travel East, Within the Mist.......16 paces, away from your next clue");
			}
				
			else if (input.contentEquals("6")) {
				System.out.println("You Travel West, whithin the deep seeded fog .... 3 paces away from your next clue");
			}
			else if (input.contentEquals("7")) {
				System.out.println("Go South!......You Retrace you steps and go back.....20 paces away from your Target Location " + "a Tactical retreat is best when you cn not even see infront of you!!");
			}
			else {
				System.out.println("Error, Invalid Command, Thank You,  Come Again...!!!");
			}
			if (health < 1) {
				System.out.println("You Crawl away out of the Foggy, Infinte Swamp, battered and beaten");
				break;
			}
			
			
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println(" # " + enemy + " was defeated!!! Ayeee!! Like a Spartan, I see You Shining Aye! #");
			System.out.println("You have " + health + "% Hp left. ");
			
			if(rand.nextInt(100) < healthpotiondropchance) {
				numHealthPotions++;
				System.out.println(" # The " + enemy + " dropped a health potion!! You are damnnn Lucky, I know you needed That!?!! aha!!");
				System.out.println(" # You now have " + numHealthPotions + " health potion(s) . # ");
			}
			
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("What Would you like To Do now???!!");
			System.out.println(" 1...... Continue Fighting ???!!");
			System.out.println(" 2...... Exit..??!!, John Cena's Swamp,.............See what I did there, I have jokes too, ahaha!");
			
			String getinput = in.nextLine();
			
			while(!input.contentEquals("1") &&!input.contentEquals("2")){
				System.out.println("Invalid Command, options available are the 1-7 digits");
				input = in.nextLine();
			}
			if(input.contentEquals("1")){
			System.out.println("You continue.. 2 Fight on.. and You yet, Survive Another Round, Boss Status Achieved");
		}
		else if(input.contentEquals("2")) {
					System.out.println("You Exit the never ending fog swamp somehow, and successfully return to Reality from your Lost adventure");
					
					System.out.println("Thank you for Playing, I hope you had as much fun as I did, This text based game, was brought to you by, MR B Knight, Make sure to Thank My Master, for somewhat Programming Me, I did most of the work :)!!!!!!");
					System.exit(0);
					
		}		
			System.out.println("----------------------------------------------------------------------------------------------");
					}
			}
	}


}

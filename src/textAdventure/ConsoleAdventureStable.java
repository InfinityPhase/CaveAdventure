package textAdventure;
import java.util.Scanner;
import java.util.Random;

public class ConsoleAdventureStable {

	public static String playGame = "yes";
	public static int creatureAttack = 2;
	public static double creatureHealth = 10;
	public static boolean fightWin;
	public static boolean hasSword = false;
	public static String playerClass = "Scholar";
	public static String playerName = "";
	public static int playerAttack = 2;
	public static double playerHealth = 20;
	public static String win = "In your dreams";
	public static boolean developer = false;
	public static boolean hasAmulet = false;
	public static boolean havePotionOne = false;
	public static String playerChoice = "";
	public static boolean goneLeft = false;
	public static boolean followDog;
	public static boolean goneHot;
	public static String[] creatureNames = { "Bubbly", "Troll", "dog" };
	public static boolean contDone = false;
	public static int endType;
	
	public static textAdventure game = new textAdventure();
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		game.startGame();
	}



	public void startGame() {


		//String playGame = "yes";
		int playerLevel = 0;
		//double playerStrength;
		String developerName = "Anthony Zanella";
		String developerGameName = "InfinityPhase";
		Random randomGenerator = new Random();
		double smallMagicBoulder = randomGenerator.nextInt(4);
		//double smallBoulder = 0.5;
		boolean swordChance; 
		boolean detection;

		System.out.println("You see a cave in the distance. Do you wish to apprach?");
		System.out.println("1. Yes\n2. No");
		playGame = scanner.nextLine();

		while(!(playGame.equalsIgnoreCase("yes") || playGame.equalsIgnoreCase("no"))){
			System.out.println("ERROR 404: NOT FOUND");
			System.out.println("Please retry:");
			playGame = scanner.nextLine();
		}

		if (playGame.equalsIgnoreCase("no")){
			System.out.println("You turn around and head the other way. You feel like you have abandoned your duty,\nBut you are sure there will be another hero to save the world, right?");
			game.theEnd();
		}

		else{

			System.out.println("You approach the cave, diffrent from the legends. you see a hunched figure, with a cloak insufficient to protect himself from the wind. You approach.");
			game.cont();
			System.out.println("(The Man) Welcome, stranger. You have reached the Cave. You are our last hope. The evil rests within, and has consumed the world. The nights are... I should not speak of such things.");
			game.cont();
			System.out.println("(The Man) What is your profession, traveler?");

			System.out.println("1. Warlock\n2. Assasin\n3. Swordsman\n4. Scholar");
			playerClass = scanner.nextLine();

			/*while(!(playerChoice.equalsIgnoreCase("Warlock") || playerChoice.equalsIgnoreCase("Assasin") || playerChoice.equalsIgnoreCase("Swordsman") || playerChoice.equalsIgnoreCase("Scholar") || playerChoice.equalsIgnoreCase("Developer") || playerChoice.equalsIgnoreCase("End"))){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");
				playerChoice = scanner.nextLine();
			}*/

			while(!(playerChoice.equalsIgnoreCase("Warlock") || playerChoice.equalsIgnoreCase("Assasin") || playerChoice.equalsIgnoreCase("Swordsman") || playerChoice.equalsIgnoreCase("Scholar") || playerChoice.equalsIgnoreCase("Developer") || playerChoice.equalsIgnoreCase("End") || playerChoice.equalsIgnoreCase("Show Code"))){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");
				playerChoice = scanner.nextLine();
			}
			
			if (playerClass.equalsIgnoreCase("Developer")){

				System.out.println("\nDEVELOPER MODE ENABLED. CHALLENGE NEGATED. POSSIBILITY OF SUCCESS: 100%");
				developer = true;
			}

			if (playerClass.equalsIgnoreCase("End")){
				Scanner endChoose = new Scanner(System.in);
				System.out.println("Which End type?");
				System.out.println("#1 /(developerName/)");
				System.out.println("#2 /(deadEnd/)");
				System.out.println("#3 /(gameFinish/)");
				endType = endChoose.nextInt();
				if(endType > 3){
					System.out.println("That is not a implemented endType");
					System.out.println("Please reinput integer");
				}
				endChoose.close();
				game.theEnd();
			}

			if (playerClass.equalsIgnoreCase("Show Code")){
				game.printCode();
			}


			System.out.println("\n(The Man) What do you call yourself, traveler, so we may recount your travels into the darkness below.");

			playerName = scanner.nextLine();

			if (playerName.equalsIgnoreCase(developerName)){
				System.out.println("The power of your voice cleanses the world of all imputities.");
				game.cont();
				System.out.println("You are truly the Chosen One, the all powerful.");
				game.cont();
				System.out.println("You created this world, and all inside it are yours to command.");
				game.cont();
				System.out.println("Without sound, the cave infront of you closes, sealed.");
				game.cont();
				System.out.println("The Man is rendered unconsious by your power, and with a glance,");
				game.cont();
				System.out.println(" you transport him to his home.");
				game.cont();
				System.out.println("For now, the world is safe.");
				endType = 1;
				game.theEnd();
			}

			if (playerName.equalsIgnoreCase(developerGameName)){
				System.out.println("The power of your voice cleanses the world of all imputities.");
				System.out.println("You are truly the Chosen One, the all powerful.");
				game.cont();
				System.out.println("You created this world, and all inside it are yours to command.");
				System.out.println("Without sound, the cave infront of you closes, sealed.");
				game.cont();
				System.out.println("The Man is rendered unconsious by your power, and with a glance,");
				System.out.println(" you transport him to his home.");
				game.cont();
				System.out.println("For now, the world is safe.");
				endType = 1;
				game.theEnd();
			}

			System.out.println("(The Man) Luck to you, " + playerName + ".");

			/*if (playerName.equalsIgnoreCase(kyleName)){
				System.out.println("(The Man) Wait. You, eh?");
				System.out.println("(The Man) I have heard of you. Thief, scoundrel, hooligan!");
				System.out.println("(The Man) If you are the one the Mighty One has sent, then we are truly doomed.");
			 */}


		System.out.println("\nYou enter the cave. The feeling of power seeps into you, giving you new strength.");
		playerLevel = playerLevel++;

		System.out.println("Suddenly, you hear a rumble above you. You look up, and are hit with a small boulder.");
		game.cont();

		if (developer == false){
			playerHealth -= smallMagicBoulder;

			System.out.println("The rock hurt, and you feel that the strange blue glow is not reassuring.");
		}

		else{
			System.out.println("Your Developer powers negate all damage.");
		}

		System.out.println("You feel a strange presence. It says, ");

		if (playerHealth <= 0){
			game.cont();
			System.out.println("\""+ playerName + ", you now have no life force left. You have failed me.");
			System.out.println("Due to your failure, the world was burned and poisoned. The planet died.");
			System.exit(0);
		}

		System.out.println("\""+ playerName + ", you now have " + playerHealth + " points of health left.\"");

		System.out.println("Without knowing what has spoken to you, you continue on your quest.");
		game.cont();

		game.choosePath();

		/*System.out.println("\nYou arrive at a crossroads, with three directions, all identical.");
		game.cont();
		System.out.println("Which way do you wish to continue?");
		System.out.println("1. Straight");
		System.out.println("2. Right");
		System.out.println("3. left");
		playerChoice = scanner.nextLine();*/

		/*while (playerChoice.equalsIgnoreCase("left")){

			System.out.println("\nYou prepare to head left. However, as you are striding");
			System.out.println("through the gloom, a rumble catches your attention.");
			game.cont();
			System.out.println("You step back hurredly, and the entrance is sealed with a crash, and a cloud of dust.");
			System.out.println("A large landslide has blocked the left path, but has revealed a cranny with a red bottle labled \"HEALTH\".");
			game.cont();
			System.out.println("Do you wish to drink the bottle?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			playerChoice = scanner.nextLine();

			if (playerChoice.equalsIgnoreCase("yes")){
				System.out.println("\nYou feel better, and a voice says to you:");
				System.out.println("\"You now have 10 points of life force.\"");
				playerHealth = 10;

			}





		if (playerChoice.equalsIgnoreCase("no")){
			System.out.println("\nYou ignore the bottle and continue on your quest.");
			game.cont();
			System.out.println("Do you wish to travel:");				
			System.out.println("1. Straight");
			System.out.println("2. Right");

			playerChoice = scanner.nextLine();


		}
	}*/

		if (playerChoice.equalsIgnoreCase("left")){
			game.goLeft();
		}

		else{
			//Scanner scannerRight = new Scanner(System.in);
			
			System.out.println("\nAs you walk down the hallway, you see a glint of light.");
			System.out.println("You go to investigate, and see a sword stuck in the stone. It... Shimmers... With otherworldy power.");
			game.cont();
			System.out.println("Do you wish to pull on the sword?");
			System.out.println("1. Yes");
			System.out.println("2. No");

			playerChoice = scanner.nextLine();

			while(!(playerChoice.equalsIgnoreCase("yes")) || playerChoice.equalsIgnoreCase("no")){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");
				playerChoice = scanner.nextLine();
			}

			if (playerChoice.equalsIgnoreCase("Yes")){

				swordChance = randomGenerator.nextBoolean();

				if (swordChance == (true)){
					System.out.println("\nYou try to pull the sword out of the stone, and feel it move.");
					System.out.println("You pull harder, and the sword is pulled out of the stone!");
					game.cont();
					System.out.println("You notice a scabbard near you, and place the sword into the simple sheath.\nThe sword seems... Pleased, almost, to be returned to its place of holding.");
					hasSword = true;			

				}

				if (swordChance == (false)){
					System.out.println("\nYou tug on the sword, and it shifts slightly. \nYou pull harder, and you forcefuly yank the sword out of the stone!\nYou cut yourself on the edge in your attemps, and bleed slightly.");

					if (developer == (false)){
						playerHealth = playerHealth - randomGenerator.nextInt(3);
					}

					System.out.println("You place the sword in the scabbard you find hanging on a hook on the wall.\nThe sword seems... Pleased, almost, to be returned to its place of holding.");
					System.out.println("The voice speaks again: you have " + playerHealth + " parts of Life Force left. Tread carefully.");
					game.cont();
					hasSword = true;
				}
			}

			if (playerChoice.equalsIgnoreCase("No")){
				System.out.println("\nYou ignore the sword, disturbed by the strange energy.\nThe sword seems saddened, its shimmer dulls. You are impervious to its effecs, and move on.");
				game.cont();
				hasSword = false;
			}





			System.out.println("As you walk through the door to the tunnel, you notice a slight tremor running through the floor.");
			System.out.println("You see a shadow on the wall, and freeze, hoping that the creature casting it doesn't notice yours.");
			game.cont();
			detection = randomGenerator.nextBoolean();

			if (detection == (true)){
				System.out.println("Your efforts are in vain, and the shape growls. It is a inhuman sound, full of hate.\nYou look back, but the door you passed through has shut.");

				if (hasSword == (true)){
					System.out.println("You are glad that you have a sword by your side, and are unsure of why you did not bring your own.\nThe shape moves into focus, and you see the creature's lumpy, misshappen shape.");
					game.cont();
					game.battle();
					System.out.println("You fearfuly glance around the chamber, noting the strange luminesent moss, and look at the strange creature who assaulted you.\nHowever, as you look down, you see the creature melt ino a strange, blood orange puddle..\nYou look back up and prepare to move on, stepping carefuly around the creature' remains.");
					game.cont();
					System.out.println("What do you decide to call the creature?");
					creatureNames[1] = scanner.nextLine();
					System.out.println("You decide to call the creature " + creatureNames[1] + ".");
				}

				if (hasSword == (false)){
					System.out.println("You regret not taking the sword, and you wonder why you didn't bring your own.\nThe shape moves into focus, and you see the creature's lumpy, misshappen shape.");
					game.cont();
					game.battle();
					System.out.println("You fearfuly glance around the chamber, noting the strange luminesent moss, and look at the strange creature who assaulted you.\nHowever, as you look down, you see the creature melt ino a strange, blood orange puddle..\nYou look back up and prepare to move on, stepping carefuly around the creature' remains.");
					game.cont();
				}

			}

			if (detection == (false)){
				System.out.println("The dark object passes by, and you breath a sigh of relief.\nYou step out of the tunnel into the ajoining room when a small creature leaps for your leg.");
				game.cont();
				creatureHealth = 5;
				game.battle();
				System.out.println("You fearfuly glance around the chamber, noting the strange luminesent moss, and look at the strange creature who assaulted you.\nIt looks like a large lizard, with red eyes that is.\nYou look back up and prepare to move on.");
			}

			System.out.println("You continue across the chamber, and notice numerous tunnels around the chamber.\nHowever, most appear to be sealed shut with rocks of varying sizes.");
			System.out.println("There is one tunnel still open, and you stride over to the opening. As you cross into the tunnel, you hear another thundering boom.\nYou tun around, and immediatly see that the entrance has been shut, like the other tunnels.\nYou wonder if the other tunnels were sealed after other adventurers entered.\nYou shake the feeling and move on.");
			game.cont();
			System.out.println("The tunnel has a dreary, depressing feel to it, as if there were a presence watching you. You spin around, and see nothing.\nAs you prepare to keep moving, two dark blue lights appear in the tunnel wall.\nYou jump back, collapsing against the dry, rocky wall.\nYou look again, but the lights have gone. You begin to wonder if they were ever there, or if they were only your own fears playing on you.");
			System.out.println("\"" + playerName + ", I see you...\" Rings throughout your mind. Frozen, you watch helplessly as another of the odd creature wanders up to you./n");
			game.cont();
			System.out.println("The creature sniffs at you, and yips once. It is dog-like in shape, and seems to wish for you to get up\nThe dog pulls at your shirt, and you slowly stand up.\nThe dog, as you have now decided to call... It, leads you down the tunnel. At the end, there is a fork in the road.");
			System.out.println("You look both directions, and down one you feel an intense heat, while down the other is a cooling breeze.\nThe dog seems to wish for you to follow it down the tunnel full of heat, but you are not so sure.");
			game.cont();
			game.choosePath2();
			/*System.out.println("Do you wish to go:");
			System.out.println("1. hot");
			System.out.println("2. cold");
			if (hasSword == ((true)))

				playerChoice = scanner.nextLine();

			if (playerChoice.equalsIgnoreCase ("hot")){
				System.out.println("You decide to trust the dog, and walk down the path that feels like you are nearing the center of the earth.\nYou slow down, and lean aganst the large tunnel wall.\nThe dog barks at you, and you keep moving on.\nYou look forwards, and the dog yips, excitedly.");
				game.cont();
				System.out.println("You finaly arrive at a large cavern with lava pouring down the sides, pooling and draining at the edges.\nA centerpeice of the room is a large pillar with a amulet resting on it.");
				game.cont();
				System.out.println("Do you wish to put on the amulet?");
				System.out.println("1. Yes");
				System.out.println("2. No");

				playerChoice = scanner.nextLine();

				while(!(playerChoice.equalsIgnoreCase("yes")) || playerChoice.equalsIgnoreCase("no")){
					System.out.println("ERROR 404: NOT FOUND");
					System.out.println("Please retry:");
					playerChoice = scanner.nextLine();
				}

				if (playerChoice.equalsIgnoreCase ("yes")){
					hasAmulet = true;
				}

				if (playerChoice.equalsIgnoreCase ("no")){
					hasAmulet = false;
				}
			}*/

			/*if (playerChoice.equalsIgnoreCase ("cold")){
				System.out.println("The dog whimpers, pawing at the warmer entrance. You, however, don't trust the creature, and proceed twoards the cooler tunnel.");
				System.out.println("The dog follows, gllancing around carefuly, as if it is looking out fr sometthing, or scared.");
				game.cont();
				System.out.println("The room begins to become freezing cold, with slight frost on the walls.\nThe dog like creature follows you down, and you wonder where the frost is coming from.\nYou reach a strange chamber, with a giant rock in the center.\nAs you approach, the dog whimpers, tugging at your sleeve. You carefuly creep up to the rock, and walk around to the other side of it.\nWithout warning, there is a large, thunderus rumble, and the object you belived to be a rock rises up!\nThe creature appears to be made out of the rocks around it, and it looks menacingly at you. ");
				game.cont();
				game.battle();
				System.out.println("You go to inspect the remains of the creature. It has kept its rocky outsides, even though you were able to damage it.");
				System.out.println("What do you call this creature?");
				creatureNames[2] = scanner.nextLine();
				System.out.println("With the creature you know call a " + creatureNames[2] + " dead, you look around again.");
				System.out.println("You see three large doors, and the right one which has a small, diamond shape.");
				System.out.println("The left one has a shape that looks similar to the outline of a sword.");
				System.out.println("The center one has no such shapes, and instead has a single button in the center.");
				game.cont();

				if (hasSword == (true)){

				}




			}*/
			
		}
		////scanner.close();
	}

	public void cont() {
		System.out.println("PRESS ENTER TO CONTINUE");
		Scanner wait = new Scanner(System.in);
		//wait.newLine();
		
		wait.nextLine();
		if(contDone == true){
			wait.close();
		}
		//wait.close();
	}
	//}

	public void battle(){

		int damage = 0;
		Random randomNumber = new Random();
		while (playerHealth > 0 && creatureHealth > 0){

			if (hasSword == (true)){

				playerAttack = 5;

				System.out.println("Your health is at " + playerHealth + ", and this enemy has " + creatureHealth + " points of health left.");
				damage = playerAttack + randomNumber.nextInt(4);
				System.out.println("You strike the vicious thing for " + damage + " points of damage.");
				creatureHealth -= damage;
				game.cont();
				if (developer == (false)){
					damage = creatureAttack + randomNumber.nextInt(4);
				}

				else{
					System.out.println("Your Developer powers negate all damage.");
				}

				System.out.println("The creature slashes you for " + damage + " points of damage.");
				playerHealth -= damage;

				if (playerHealth <= 0){
					endType = 2;
					game.theEnd();
				}

				playerAttack = 2;

			}

			if (hasSword == (false)){

				System.out.println("Your health is at " + playerHealth + ", and this enemy has " + creatureHealth + " points of health left.");
				damage = playerAttack + randomNumber.nextInt(4);
				System.out.println("You strike the vicious thing for " + damage + " points of damage.");
				creatureHealth -= damage;
				game.cont();
				if (developer == (false)){
					damage = creatureAttack + randomNumber.nextInt(2);
				}

				else{
					System.out.println("Your Developer powers negate all damage.");
				}

				System.out.println("The creature slashes you for " + damage + " points of damage.");
				playerHealth -= damage;

				if (playerHealth <= 0){
					game.theEnd();
				}

			}
		}
		System.out.println("You defeat creature.");
		game.cont();
		System.out.println("Your health is now at " + playerHealth + " points of life force.");
		game.cont();
	}

	public void theEnd(){
		//Scanner scanner = new Scanner(System.in);
		
		if(endType == 1){
			System.out.println("You have now reached the end of the game,");
			System.out.println("and you are free to continue in your life.");
			game.cont();
			System.out.println("You may always wonder, why did this happen?");
			game.cont();
			System.out.println("Could I have done it another way?");
			game.cont();
			System.out.println("Should I have?");
			//Once you figure out a timer, place it here to advance the text.
			System.out.println("Don't worry, put your mind at ease,");
			System.out.println("and continue on.");
			System.out.println("Do you wish to play again?");

			String ifRetry = scanner.nextLine();
			System.out.println("1. Yes"); 
			System.out.println("2. No");

			while(!(playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("no"))){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please scanner:");
				playerChoice = scanner.nextLine();
			}

			if (ifRetry.equalsIgnoreCase("Yes")){
				game.startGame();
			}
		
			else{
				System.out.println("This game was imgained by, coded by, and written by Anthony Zanella.");
				System.out.println("Thank you for playing.");
				game.cont();
				System.out.println("Goodbye, and so long.");
				contDone = true;
				game.cont();
				scanner.close();
				System.exit(0);
			}
			
		}

		if(endType == 2){
			System.out.println("You have failed. You were the last hope,");
			game.cont();
			System.out.println("The last hope of the people.");
			game.cont();
			System.out.println("And now, there is nothing between the evil and the people.");
			game.cont();
			System.out.println("Due to your failure, the world was burned and poisoned. The planet died.");
			game.cont();
			System.out.println("Do you wish to play again?");

			String ifRetry = scanner.nextLine();
			System.out.println("1. Yes");
			System.out.println("2. No");

			while(!(playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("no"))){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please scanner:");
				playerChoice = scanner.nextLine();
			}

			if (ifRetry.equalsIgnoreCase("Yes")){
				game.startGame();
			}

			else{
				System.out.println("This game was imgained by, coded by, and written by Anthony Zanella.");
				System.out.println("Thank you for playing.");
				game.cont();
				System.out.println("Goodbye, and so long.");
				contDone = true;
				game.cont();
				scanner.close();
				System.exit(0);
			}
		}
		
		System.out.println("You have reached the end of the game. Congratulations.");
		System.out.println("There is no cake. I never said there was. There is no lie.");
		game.cont();
		System.out.println("Only truth");
		System.out.println("Only the end.");
		System.out.println("What happens now is unknown. you can't do anything now.");
		game.cont();
		System.out.println("Nothing but play again.");
		System.out.println("Goodbye, for now.");
		game.cont();
		System.out.println("Do you wish to play again?");

		String ifRetry = scanner.nextLine();
		System.out.println("1. Yes");
		System.out.println("2. No");

		while(!(playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("no"))){
			System.out.println("ERROR 404: NOT FOUND");
			System.out.println("Please scanner:");
			playerChoice = scanner.nextLine();
		}

		if (ifRetry.equalsIgnoreCase("Yes")){
			game.startGame();
		}

		else{
			System.out.println("This game was imgained by, coded by, and written by Anthony Zanella.");
			System.out.println("Thank you for playing.");
			game.cont();
			System.out.println("Goodbye, and so long.");
			contDone = true;
			game.cont();
			scanner.close();
			System.exit(0);
		}
	} 	
	public void goLeft(){

		//Scanner scanner = new Scanner(System.in);
		


		if (goneLeft == (false)){

			goneLeft = true;
			System.out.println("\nYou prepare to head left. However, as you are striding");
			System.out.println("through the gloom, a rumble catches your attention.");
			game.cont();
			System.out.println("You step back hurredly, and the entrance is sealed with a crash, and a cloud of dust.");
			System.out.println("A large landslide has blocked the left path, but has revealed a cranny with a red bottle labled \"HEALTH\".");
			game.cont();
			System.out.println("Do you wish to drink the bottle?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			playerChoice = scanner.nextLine();

			/*while(!(playerChoice.equalsIgnoreCase("yes")) || playerChoice.equalsIgnoreCase("no")){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");
				playerChoice = scanner.nextLine();
			*/}

			if (playerChoice.equalsIgnoreCase("yes")){
				System.out.println("\nYou feel better, and a voice says to you:");
				System.out.println("\"You now have 20 points of life force.\"");
				playerHealth = 20;
				havePotionOne = true;
			}

			if (playerChoice.equalsIgnoreCase("no")){
				System.out.println("You ignore the bottle.");
				havePotionOne = false;
			}
			game.cont();
			game.choosePath();
		//}

		if (goneLeft == (true)){
			goneLeft = true;
			System.out.println("You go back down the left path.");

			if (havePotionOne == (true)){
				System.out.println("There is nothing here.");
				System.out.println("You go back to the crossroads.");
			}
			if (havePotionOne == (false)){
				System.out.println("There is a red bottle labled \"HEALTH\".");
				System.out.println("Do you wish to drink the bottle?");
				System.out.println("1. Yes");
				System.out.println("2. No");

				playerChoice = scanner.nextLine();

				while(!(playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("no"))){
					System.out.println("ERROR 404: NOT FOUND");
					System.out.println("Please retry:");
					playerChoice = scanner.nextLine();
				}

				if (playerChoice.equalsIgnoreCase("yes")){
					System.out.println("\nYou feel better, and a voice says to you:");
					System.out.println("\"You now have 20 points of life force.\"");
					playerHealth = 20;
					havePotionOne = true;

				}
				if (playerChoice.equalsIgnoreCase("no")){
					System.out.println("You ignore the bottle.");
					havePotionOne = false;
				}
			}
		}
		game.cont();
		game.choosePath();
		//scanner.close();
	}

	public void choosePath(){
		//Scanner scanner = new Scanner(System.in);


		if (goneLeft == (false)){
			System.out.println("\nYou arrive at a crossroads, with two directions, both identical.");
			game.cont();
			System.out.println("Which way do you wish to continue?");
			System.out.println("1. Right");
			System.out.println("2. Left");
			playerChoice = scanner.nextLine();

			/*while(!(playerChoice.equalsIgnoreCase("left")) || playerChoice.equalsIgnoreCase("right")){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");
				playerChoice = scanner.nextLine();
			 */}



		else {
			System.out.println("You look at the two paths, one shut by a landslide.");
			game.cont();
			System.out.println("Which way do you wish to continue?");
			System.out.println("1. Right");
			System.out.println("2. Left");
			playerChoice = scanner.nextLine();
		}
	}

	public void printCode(){

		//Scanner scanner = new Scanner(System.in);
		String choice = "";

		System.out.println("PREPARING TO PRINT CODE");
		System.out.println("ENTER \"YES\" TO CONFIRM, ENTER \"NO\" TO CANCEL");

		choice = scanner.nextLine();

		while(!(playerChoice.equalsIgnoreCase("Yes") || playerChoice.equalsIgnoreCase("no"))){
			System.out.println("ERROR 404: NOT FOUND");
			System.out.println("Please retry:");
			choice = scanner.nextLine();
		}

		if (choice.equalsIgnoreCase("no")){
			System.out.println("CANCELING PRINT");
			game.cont();
		}

		if (choice.equalsIgnoreCase("yes")){
			System.out.println("ERROR 404: NOT FOUND");
		}
		//scanner.close();	
	}

	public void choosePath2(){
		//Scanner scanner = new Scanner(System.in);

		System.out.println("Do you wish to go:");
		System.out.println("1. hot");
		System.out.println("2. cold");

		playerChoice = scanner.nextLine();

		if (playerChoice.equalsIgnoreCase ("hot")){
			game.goHot();
		}

		if (playerChoice.equalsIgnoreCase("cold")){
			game.goCold();
		}

		//scanner.close();
	}
	public void goHot(){

		//Scanner scanner = new Scanner(System.in);

		followDog = true;

		if (goneHot == (false)){
			System.out.println("You decide to trust the dog, and walk down the path that feels like you are nearing the center of the earth.\nYou slow down, and lean aganst the large tunnel wall.\nThe dog barks at you, and you keep moving on.\nYou look forwards, and the dog yips, excitedly.");
			game.cont();
			System.out.println("You finaly arrive at a large cavern with lava pouring down the sides, pooling and draining at the edges.\nA centerpeice of the room is a large pillar with a amulet resting on it.");
			game.cont();
			System.out.println("Do you wish to put on the amulet?");
			System.out.println("1. Yes");
			System.out.println("2. No");

			playerChoice = scanner.nextLine();

			while(!(playerChoice.equalsIgnoreCase("yes")) || playerChoice.equalsIgnoreCase("no")){
				System.out.println("ERROR 404: NOT FOUND");
				System.out.println("Please retry:");

				playerChoice = scanner.nextLine();
			}

			if (playerChoice.equalsIgnoreCase ("yes")){
				hasAmulet = true;
			}

			if (playerChoice.equalsIgnoreCase ("no")){
				hasAmulet = false;
			}
		}

		if (goneHot == (true)){
			System.out.println("You return to the hot cavern.");

			if (hasAmulet == (false)){
				System.out.println("Do you wish to put on the amulet?");
				System.out.println("1. Yes");
				System.out.println("2. No");

				while(!(playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("no"))){
					System.out.println("ERROR 404: NOT FOUND");
					System.out.println("Please retry:");
					playerChoice = scanner.nextLine();
				}

				if (playerChoice.equalsIgnoreCase ("yes")){
					hasAmulet = true;
				}

				if (playerChoice.equalsIgnoreCase ("no")){
					hasAmulet = false;
				}

			}

			if (hasAmulet == (true)){
				System.out.println("There is nothing of interest here.");
			}

		}
		game.cont();
		System.out.println("You return to the crossroads.");
		goneHot = true;
		//scanner.close();
		game.choosePath2();

	}

	public void goCold(){

		String doorChoice ="grey";
		//Scanner scanner = new Scanner(System.in);

		System.out.println("The dog whimpers, pawing at the warmer entrance. You, however, don't trust the creature, and proceed twoards the cooler tunnel.");
		System.out.println("The dog follows, glancing around carefuly, as if it is looking out fr sometthing, or scared.");
		game.cont();
		System.out.println("The room begins to become freezing cold, with slight frost on the walls.\nThe dog like creature follows you down, and you wonder where the frost is coming from.\nYou reach a strange chamber, with a giant rock in the center.\nAs you approach, the dog whimpers, tugging at your sleeve. You carefuly creep up to the rock, and walk around to the other side of it.\nWithout warning, there is a large, thunderus rumble, and the object you belived to be a rock rises up!\nThe creature appears to be made out of the rocks around it, and it looks menacingly at you. ");
		game.cont();
		game.battle();
		System.out.println("You go to inspect the remains of the creature. It has kept its rocky outsides, even though you were able to damage it.");
		System.out.println("What do you call this creature?");
		creatureNames[2] = scanner.nextLine();
		System.out.println("With the creature you now call a " + creatureNames[2] + " dead, you look around again.");
		System.out.println("You see three large doors, and the right one which has a small, diamond shape.");
		game.cont();
		System.out.println("The left one has a shape that looks similar to the outline of a sword.");
		System.out.println("The center one has no such shapes, and instead has a single button in the center.");
		game.cont();

		if (hasSword == (true)){
			System.out.println("You realize that your sword could fit in the left door.");
		}

		if (hasAmulet == (true)){
			System.out.println(("You realize that your amulet could fit in the right door."));
		}
		game.cont();
		System.out.println("Which door do you want to enter:");
		System.out.println("1. Left");
		System.out.println("2. Right");
		System.out.println("3. Center");
		doorChoice = scanner.nextLine();

		while(!(playerChoice.equalsIgnoreCase("left") || playerChoice.equalsIgnoreCase("center") || playerChoice.equalsIgnoreCase("right"))){
			System.out.println("ERROR 404: NOT FOUND");
			System.out.println("Please retry:");
			playerChoice = scanner.nextLine();
		}

		if (playerChoice.equalsIgnoreCase("Left")){
			if (hasSword == (false)){

				System.out.println("You don't have a way of opening the door.");
			}

			if (hasSword == (true)){
				System.out.println("You open the door and walk inside.");
				System.out.println("The zone inside the door is a deep red, and when you enter, all of reality flashes before you.");
				doorChoice = "red";
				//scanner.close();
				game.theEnd();
			}

		}

		if (playerChoice.equalsIgnoreCase("right")){

			if (hasAmulet == (false)){
				System.out.println("You don't have a way of opening the door.");
			}

			if (hasAmulet == (true)){
				System.out.println("You open the door and walk inside.");
				System.out.println("The area inside the door is a dark, royal purple. You feel nothing for a moment, before the all of reality flashes before your eyes.");
				doorChoice = "purple";
				//scanner.close();
				game.theEnd();
			}

		}

		if (playerChoice.equalsIgnoreCase("center")){
			System.out.println("You open the door and walk inside the grey, glowing portal.");
			System.out.println("You feel nothing for a moment, before the all of reality flashes before your eyes.");
			doorChoice = "grey";
			//scanner.close();
			game.theEnd();
		}

	}
	//wait.close();
}


package Nicholas.Hyland;

public class Moped {

	public int currentStreet = 10;
	public int currentAvenue = 5;
	String gear = "normal";
	
	int gasLevel = 20;
	
	String currentDirection = "South";
	
	public void randomLocation() {
		int randomAvenue = (int)((Math.random() * 10) + 1);
		int randomStreet = (int)((Math.random() * 200) + 1);
		this.currentAvenue = randomAvenue;
		this.currentStreet = randomStreet;
	}
	
	public float howWeDoing() {
		float gasPercent = (this.gasLevel/20.0f)*100;
		return gasPercent;
	}
	
	public void randomMove() {
		int random = (int)((Math.random() * 4) + 1);
		if (random == 1) {
			randomGoLeft();
		}
		else if (random == 2) {
			randomGoRight();
		}
		else if (random == 3) {
			randomStraightOn();
		}
		else {
			randomBackUp();
		}
	}
	
	public void goLeft() {

		if (this.currentDirection.equals("North")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				System.out.println("Going left...");
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go left anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentAvenue > 1  && this.gasLevel > 0) {
				System.out.println("Going left...");
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go left anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				System.out.println("Going left...");
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go left anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {
				System.out.println("Going left...");
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go left anymore!");
				}
			}
		}
		if (this.gear.equals("normal")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "West";
				break;
			case ("South"):
				this.currentDirection = "East";
				break;
			case ("West"):
				this.currentDirection = "South";
				break;
			case ("East"):
				this.currentDirection = "North";
				break;
			}
		}
		else if (gear.equals("reverse")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "East";
				break;
			case ("South"):
				this.currentDirection = "West";
				break;
			case ("West"):
				this.currentDirection = "North";
				break;
			case ("East"):
				this.currentDirection = "South";
				break;
			}
		}
		
		
		System.out.println("Now at Street " + this.currentStreet + "  and Avenue " + this.currentAvenue + ", facing " + this.currentDirection + ".");
		System.out.printf("Current gas level is at %.1f percent!\n", howWeDoing());
		System.out.println();
	}

	public void goRight() {
		if (this.currentDirection.equals("North")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				System.out.println("Going right...");
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go right anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentAvenue < 10  && this.gasLevel > 0) {
				System.out.println("Going right...");
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go right anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {
				System.out.println("Going right...");
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go right anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				System.out.println("Going right...");
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go right anymore!");
				}
			}
		}
		
		if (gear.equals("normal")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "East";
				break;
			case ("South"):
				this.currentDirection = "West";
				break;
			case ("West"):
				this.currentDirection = "North";
				break;
			case ("East"):
				this.currentDirection = "South";
				break;
			}
		}
		else if (gear.equals("reverse")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "West";
				break;
			case ("South"):
				this.currentDirection = "East";
				break;
			case ("West"):
				this.currentDirection = "South";
				break;
			case ("East"):
				this.currentDirection = "North";
				break;
			}
		}

		
		System.out.println("Now at Street " + this.currentStreet + "  and Avenue " + this.currentAvenue + ", facing " + this.currentDirection + ".");
		System.out.printf("Current gas level is at %.1f percent!\n", howWeDoing());
		System.out.println();
	}
	
	public void straightOn() {
		if (this.currentDirection.equals("North")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {	
				System.out.println("Going forward...");
				this.gear = "normal";
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go forward anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentStreet > 1  && this.gasLevel > 0) {
				System.out.println("Going forward...");
				this.gear = "normal";
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go forward anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				System.out.println("Going forward...");
				this.gear = "normal";
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go forward anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				System.out.println("Going forward...");
				this.gear = "normal";
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go forward anymore!");
				}
			}
		}
		
		System.out.println("Now at Street " + this.currentStreet + "  and Avenue " + this.currentAvenue + ", facing " + this.currentDirection + ".");
		System.out.printf("Current gas level is at %.1f percent!\n", howWeDoing());
		System.out.println();
	}
	
	public void backUp() {
		if (this.currentDirection.equals("North")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				System.out.println("Going back...");
				this.gear = "reverse";
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go back anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentStreet < 200  && this.gasLevel > 0) {
				System.out.println("Going back...");
				this.gear = "reverse";
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go back anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				System.out.println("Going back...");
				this.gear = "reverse";
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go back anymore!");
				}
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				System.out.println("Going back...");
				this.gear = "reverse";
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
			else {
				if (this.gasLevel == 0) {
					System.out.println("You have run out of gas!");
				}
				else {
					System.out.println("Sorry cannot go back anymore!");
				}
			}
		}
		
		System.out.println("Now at Street " + this.currentStreet + "  and Avenue " + this.currentAvenue + ", facing " + this.currentDirection + ".");
		System.out.printf("Current gas level is at %.1f percent!\n", howWeDoing());
		System.out.println();
	}
	
	
	public void randomGoLeft() {

		if (this.currentDirection.equals("North")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentAvenue > 1  && this.gasLevel > 0) {
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
		}
		
		if (this.gear.equals("normal")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "West";
				break;
			case ("South"):
				this.currentDirection = "East";
				break;
			case ("West"):
				this.currentDirection = "South";
				break;
			case ("East"):
				this.currentDirection = "North";
				break;
			}
		}
		else if (gear.equals("reverse")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "East";
				break;
			case ("South"):
				this.currentDirection = "West";
				break;
			case ("West"):
				this.currentDirection = "North";
				break;
			case ("East"):
				this.currentDirection = "South";
				break;
			}
		}
	}

	public void randomGoRight() {
		if (this.currentDirection.equals("North")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentAvenue < 10  && this.gasLevel > 0) {
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
		}
		
		if (gear.equals("normal")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "East";
				break;
			case ("South"):
				this.currentDirection = "West";
				break;
			case ("West"):
				this.currentDirection = "North";
				break;
			case ("East"):
				this.currentDirection = "South";
				break;
			}
		}
		else if (gear.equals("reverse")) {
			switch (this.currentDirection) {
			case ("North"):
				this.currentDirection = "West";
				break;
			case ("South"):
				this.currentDirection = "East";
				break;
			case ("West"):
				this.currentDirection = "South";
				break;
			case ("East"):
				this.currentDirection = "North";
				break;
			}
		}
	}
	
	public void randomStraightOn() {
		if (this.currentDirection.equals("North")) {
			if (this.currentStreet < 200 && this.gasLevel > 0) {	
				this.gear = "normal";
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentStreet > 1  && this.gasLevel > 0) {
				this.gear = "normal";
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				this.gear = "normal";
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				this.gear = "normal";
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
		}
	
	}
	
	public void randomBackUp() {
		if (this.currentDirection.equals("North")) {
			if (this.currentStreet > 1 && this.gasLevel > 0) {
				this.gear = "reverse";
				this.currentStreet -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("South")) {
			if (this.currentStreet < 200  && this.gasLevel > 0) {
				this.gear = "reverse";
				this.currentStreet += 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("West")) {
			if (this.currentAvenue > 1 && this.gasLevel > 0) {
				this.gear = "reverse";
				this.currentAvenue -= 1;
				this.gasLevel -= 1;
			}
		}
		else if (this.currentDirection.equals("East")) {
			if (this.currentAvenue < 10 && this.gasLevel > 0) {
				this.gear = "reverse";
				this.currentAvenue += 1;
				this.gasLevel -= 1;
			}
		}
	}
	
	public void randomFillHerUp() {
		this.gasLevel = 20;
	}
	
	public void fillHerUp() {
		this.gasLevel = 20;
		System.out.println("Gas is filled up!");
		System.out.println();
	}
	
	public void park() {
		System.out.println("You have parked your car on the sidewalk!");
		System.exit(0);
	}
	
	public void goToPetiteAbeille() {
		boolean backHome = false;
		while (!backHome) {
			if (this.currentStreet == 17 && this.currentAvenue == 6) {
				System.out.println("You have now reached Petite Abeille!");
				System.out.println();
				backHome = true;
			}
			if (this.gasLevel == 0) {
				fillHerUp();
			}
			
				if (this.currentStreet > 17 && this.currentDirection.equals("North")) {
					backUp();
				}
				else if (this.currentStreet > 17 && this.currentDirection.equals("South")) {
					straightOn();
				}
				else if (this.currentStreet > 17 && this.currentDirection.equals("West")) {
					goLeft();
				}
				else if (this.currentStreet > 17 && this.currentDirection.equals("East")) {
					goRight();
				}
				else if (this.currentStreet < 17 && this.currentDirection.equals("North")) {
					straightOn();
				}
				else if (this.currentStreet < 17 && this.currentDirection.equals("South")) {
					backUp();
				}
				else if (this.currentStreet < 17 && this.currentDirection.equals("West")) {
					goRight();
				}
				else if (this.currentStreet < 17 && this.currentDirection.equals("East")) {
					goLeft();
				}
				
				else if (this.currentAvenue > 6 && this.currentDirection.equals("North")) {
					goRight();
				}
				else if (this.currentAvenue > 6 && this.currentDirection.equals("South")) {
					goLeft();
				}
				else if (this.currentAvenue > 6 && this.currentDirection.equals("West")) {
					backUp();
				}
				else if (this.currentAvenue > 6 && this.currentDirection.equals("East")) {
					straightOn();
				}
				else if (this.currentAvenue < 6 && this.currentDirection.equals("North")) {
					goLeft();
				}
				else if (this.currentAvenue < 6 && this.currentDirection.equals("South")) {
					goRight();
				}
				else if (this.currentAvenue < 6 && this.currentDirection.equals("West")) {
					straightOn();
				}
				else if (this.currentAvenue < 6 && this.currentDirection.equals("East")) {
					backUp();
			}
		}
	}
	
	public static void help() {
		System.out.println();
		System.out.println("Here is the list of commands you can use: ");
		System.out.printf("%-25s %-25s\n", "'go left'", "- car turns left and drives one block");
		System.out.printf("%-25s %-25s\n", "'go right'", "- car turns right and drives one block");
		System.out.printf("%-25s %-25s\n", "'straight on'", "- car drives one block forward");
		System.out.printf("%-25s %-25s\n", "'back up'", "- car reverses one block");
		System.out.printf("%-25s %-25s\n", "'how we doing?'", "- tells you how much gas you have");
		System.out.printf("%-25s %-25s\n", "'fill her up'", "- fills up your gas");
		System.out.printf("%-25s %-25s\n", "'park'", "- parks your car and exits the system");
		System.out.printf("%-25s %-25s\n", "'go to Petite Abeille'", "- goes back to Petite Abille");
		System.out.printf("%-25s %-25s\n", "'help'", "- displays this help message");
		System.out.println();
	}
	
	public static void AmericanMuseumOfNaturalHistory() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("WELCOME TO THE AMERICAN MUSEUM OF NATURAL HISTORY!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public static void MemorialSloanKettering() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("WELCOME TO THE MEMORIAL SLOAN KETTERING!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public static void TheStrand() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("WELCOME TO THE STRAND!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public static void FaydaCoffeeTeaCookiesCake() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("WELCOME TO THE FAYDA COFFEE TEA COOKIES CAKE!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
}


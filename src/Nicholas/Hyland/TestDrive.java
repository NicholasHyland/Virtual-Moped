package Nicholas.Hyland;

import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		System.out.println("Thank you for choosing Nick's moped services! We are currently at Street 10 and Avenue 5 facing South.");
		System.out.println("At any time type 'help' for assistance.");
		System.out.println("Also beware of drunk drivers!");
		System.out.println();
		Scanner input = new Scanner(System.in);
		
		Moped crazyCar1 = new Moped();
		Moped crazyCar2 = new Moped();
		Moped m = new Moped();
		Moped m2 = new Moped();
		
		crazyCar1.randomLocation();
		crazyCar2.randomLocation();

		while (true) {
			System.out.print("What would you like to do? ");
			String command = input.nextLine();
			
			crazyCar1.randomFillHerUp();
			crazyCar2.randomFillHerUp();
			
			System.out.println();
			
			switch (command) {
			case "go left":
				m.goLeft();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "go right":
				m.goRight();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "straight on":
				m.straightOn();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "back up":
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				m.backUp();
				break;
			case "how we doing?":
				System.out.println();
				System.out.println("Current gas level is at " + m.howWeDoing() + "percent!");
				System.out.println();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "fill her up":
				m.fillHerUp();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "park":
				System.out.println();
				m.park();
				break;
			case "go to Petite Abeille":
				m.goToPetiteAbeille();
				crazyCar1.randomMove();
				crazyCar2.randomMove();
				crash(crazyCar1, crazyCar2, m);
				break;
			case "help":
				Moped.help();
				break;
			default:
				System.out.println("Sorry we did not understand that command. Enter 'help' for the command list.");
				System.out.println();
				break;
			}
			
			if (m.currentStreet == 79 && m.currentAvenue == 8) {
				Moped.AmericanMuseumOfNaturalHistory();
			}
			else if (m.currentStreet == 74 && m.currentAvenue == 1) {
				Moped.MemorialSloanKettering();
			}
			else if (m.currentStreet == 12 && m.currentAvenue == 4) {
				Moped.TheStrand();
			}
			else if (m.currentStreet == 3 && m.currentAvenue == 6) {
				Moped.FaydaCoffeeTeaCookiesCake();
			}
		}
	}
	
	public static void crash(Moped car1, Moped car2, Moped user) {
		if ((car1.currentStreet == car2.currentStreet) && (car1.currentAvenue == car2.currentAvenue)) {
			System.out.println("Drunk driver 1 has crashed into drunk driver 2!");
			System.exit(0);
		}
		else if ((car1.currentStreet == user.currentStreet) && (car1.currentAvenue == user.currentAvenue)) {
			System.out.println("Drunk driver 1 has crashed into you!");
			System.exit(0);
		}
		else if ((car2.currentStreet == user.currentStreet) && (car2.currentAvenue == user.currentAvenue)) {
			System.out.println("Drunk driver 2 has crashed into you!");
			System.exit(0);
		}
	}	
}
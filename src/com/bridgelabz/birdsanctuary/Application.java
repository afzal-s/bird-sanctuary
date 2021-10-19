package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

import com.bridgelabz.birdsanctuary.Bird.Gender;

/**
 *  Controller Layer
 *
 * @author xfzxl
 */
public class Application {

	/**
	 * Static Method For 
	 * Welcome Message To User.
	 */
	static {
		System.out.println("\n-------------------------------------------"
				+ "\n\tWELCOME TO  BIRD SANCTUARY\n------------------"
				+ "-------------------------");
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.showOptionMenu();
	}

	private void showOptionMenu() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		boolean exit = false;

		while (!exit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nPRESS 1: Add Bird \nPRESS 2: Remove Bird \nPRESS 3: Print Bird "
					+ "\nPRESS 4: Update Bird \nPRESS 5: Exit");
			System.out.print("\nEnter Your Choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				userInterface.addBird();
				break;
			case 2:
				System.out.print("\nEnter The Bird Name You Want To Remove: ");
				Scanner scan = new Scanner(System.in);
				String birdName = scan.nextLine();

				Bird foundBird = birdRepository.getBird(birdName);
				birdRepository.removeBird(foundBird);
				break;
			case 3:
				userInterface.printAllBirds(birdRepository.getBirdList());
				break;
			case 4:
				userInterface.updateBird();
				break;
			case 5:
				exit = true;
				System.out.println("\n*** Thankyou For Visiting ***");
				break;
			default:
				System.out.println("\n*** Error!! Invalid Input: Enter 1, 2, 3 Or 4 To Exit. ***");
			}
		}
	}

}
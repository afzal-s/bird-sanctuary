package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

import com.bridgelabz.birdsanctuary.Bird.Gender;

// Controller Layer
public class Application {

	public static void main(String[] args) {
		System.out.println(
				"\n-------------------------------------------"
				+ "\n\tWELCOME TO  BIRD SANCTUARY\n------------------"
				+ "-------------------------");

		Application application = new Application();
		application.showOptionMenu();
	}

	private void showOptionMenu() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();


		boolean exit = false;

		while (!exit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"\nPRESS 1: Add Bird \nPRESS 2: Remove Bird \nPRESS 3: Print Bird "
					+ "\nPRESS 4: Update Bird \nPRESS 5: Exit");
			System.out.print("\nEnter Your Choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
//				UserInterface userInterface = UserInterface.getInstance();
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
//				UserInterface userInterface1 = UserInterface.getInstance();
				userInterface.printAllBirds(birdRepository.getBirdList());
				break;
			case 4:
//				UserInterface userInterface2 = UserInterface.getInstance();
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

	/*
	private void addHardcordedBirdValue() {
		BirdRepository birdRepository = BirdRepository.getInstance();

		Pigeon pigeon = new Pigeon();
		pigeon.id = "PE01";
		pigeon.gender = Gender.FEMALE;

		Eagle eagle = new Eagle();
		eagle.id = "E001";
		eagle.gender = Gender.MALE;

		Crow crow = new Crow();
		crow.id = "C001";
		crow.gender = Gender.MALE;

		Penguin penguin = new Penguin();
		penguin.id = "PN01";
		penguin.gender = Gender.FEMALE;

		Duck duck = new Duck();
		duck.id = "D001";
		duck.gender = Gender.MALE;

		Duck duck2 = new Duck();
		duck2.id = "D001";
		duck2.gender = Gender.FEMALE;

		birdRepository.add(duck);
		birdRepository.add(duck2);
		birdRepository.add(crow);
		birdRepository.add(eagle);
		birdRepository.add(penguin);
		birdRepository.add(pigeon);
	}
	*/
}
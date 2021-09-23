package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

// Controller Layer
public class Application {
	BirdRepository birdRepository = new BirdRepository();

	public static void main(String[] args) {
		System.out.println("Welcome To Bird Sanctuary.\n");

		/*
		 * BirdRepository birdRepository = new BirdRepository();
		 * 
		 * Pigeon pigeon = new Pigeon(); pigeon.id = "PE01"; pigeon.gender = "Female";
		 * 
		 * Eagle eagle = new Eagle(); eagle.id = "E001"; eagle.gender = "Male";
		 * 
		 * Crow crow = new Crow(); crow.id = "C001"; crow.gender = "Male";
		 * 
		 * Penguin penguin = new Penguin(); penguin.id = "PN01"; penguin.gender =
		 * "Female";
		 * 
		 * Duck duck = new Duck(); duck.id = "D001"; duck.gender = "Male";
		 * 
		 * Duck duck2 = new Duck(); duck2.id = "D001"; duck2.gender = "Female";
		 * 
		 * birdRepository.add(duck); birdRepository.add(duck2);
		 * birdRepository.add(crow); birdRepository.add(eagle);
		 * birdRepository.add(penguin); birdRepository.add(pigeon);
		 * 
		 * UserInterface userInterface = new UserInterface();
		 * 
		 * System.out.println("All Birds: ");
		 * userInterface.printAllBirds(birdRepository.getBirdList());
		 * System.out.println("\nAfter Deletion: "); birdRepository.remove(duck);
		 * userInterface.printAllBirds(birdRepository.getBirdList());
		 */

		Application application = new Application();
		application.showOptionMenu();
	}

	private void showOptionMenu() {
		boolean exit = false;

		while (!exit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("PRESS 1: Add Bird \nPRESS 2: Remove Bird \nPRESS 3: Print Bird \nPRESS 4: Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addBird();
				break;
			case 2:
				System.out.print("Enter The Bird Name You Want To Remove: ");
				Scanner scan = new Scanner(System.in);
				String birdName = scan.nextLine();
				Bird foundBird = birdRepository.getBird(birdName);
				birdRepository.removeBird(foundBird);
				break;
			case 3:
				UserInterface userInterface = new UserInterface();
				userInterface.printAllBirds(birdRepository.getBirdList());
				break;
			case 4:
				exit = true;
			default:
				break;
			}
		}

	}

	private void addBird() {
		Pigeon pigeon = new Pigeon();
		pigeon.id = "PE01";
		pigeon.gender = "Female";

		Eagle eagle = new Eagle();
		eagle.id = "E001";
		eagle.gender = "Male";

		Crow crow = new Crow();
		crow.id = "C001";
		crow.gender = "Male";

		Penguin penguin = new Penguin();
		penguin.id = "PN01";
		penguin.gender = "Female";

		Duck duck = new Duck();
		duck.id = "D001";
		duck.gender = "Male";

		Duck duck2 = new Duck();
		duck2.id = "D001";
		duck2.gender = "Female";

		birdRepository.add(duck);
		birdRepository.add(duck2);
		birdRepository.add(crow);
		birdRepository.add(eagle);
		birdRepository.add(penguin);
		birdRepository.add(pigeon);
	}
}

package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

import com.bridgelabz.birdsanctuary.Bird.Color;

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
//				userInterface.addBird();
				addBird();
				break;
			case 2:
				System.out.print("\nEnter The Bird Name You Want To Remove: ");
				Scanner scan = new Scanner(System.in);
				String birdName = scan.nextLine();

				Bird foundBird = birdRepository.getBird(birdName);
				birdRepository.removeBird(foundBird);
				break;
			case 3:
				UserInterface userInterface1 = UserInterface.getInstance();
				userInterface1.printAllBirds(birdRepository.getBirdList());
				break;
			case 4:
				updateBird();
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


	private void updateBird() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nEnter Bird Name To Update: ");
		String birdName = scanner.nextLine();
		BirdRepository birdRepository = BirdRepository.getInstance();
		Bird searchBird = birdRepository.getBird(birdName);

		boolean exit = false;

		while (!exit) {
			scanner = new Scanner(System.in);
			System.out.println(
					"\nPRESS 1: Update Color \nPRESS 2: Update Id \nPRESS 3: Update Name"
					+ " \nPRESS 4: Update Gender \nPRESS 5: Exit");
			System.out.print("\nEnter Your Choice: ");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("\nEnter Color: ");
				System.out.println("1. White "
						+ "2. Black"
						+ "3. Grey"
						+ "4. Green"
						+ "5. Black & White");
				int choice = scanner.nextInt();
				switch(choice) {
				case 1:
					searchBird.color = Color.WHITE;
					break;
				case 2:
					searchBird.color = Color.BLACK;
					break;
				case 3:
					searchBird.color = Color.GREY;
					break;
				case 4:
					searchBird.color = Color.GREEN;
					break;
				case 5:
					searchBird.color = Color.BLACK_WHITE;
					break;
				}
				break;
			case 2:
				System.out.print("\nEnter ID: ");
				String id = scanner.next();
				searchBird.id = id;
				break;
			case 3:
				System.out.print("\nEnter Name: ");
				String name = scanner.next();
				searchBird.name = name;
				break;
			case 4:
				System.out.print("\nEnter Gender: ");
				String gender = scanner.next();
				searchBird.gender = gender;
				break;
			case 5:
				exit = true;
				System.out.print("\n*** UPDATED!! ***\n");
				break;
			default:
				System.out.println("\n*** Error!! Invalid Input: "
						+ "Enter 1, 2, 3, 4 To Update Or 5 To Exit. ***");
				break;
			}
		}
	}

	private void addBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();

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
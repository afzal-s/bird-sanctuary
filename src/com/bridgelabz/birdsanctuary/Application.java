package com.bridgelabz.birdsanctuary;

// Controller Layer
public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome To Bird Sanctuary.\n");

		BirdRepository birdRepository = new BirdRepository();

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
		
		System.out.println("All Birds: ");
		UserInterface userInterface = new UserInterface();

		userInterface.printAllBirds(birdRepository.getBirdList());

		System.out.println("\nAfter Deletion: ");
		 birdRepository.remove(duck);
		 userInterface.printAllBirds(birdRepository.getBirdList());
	}
}

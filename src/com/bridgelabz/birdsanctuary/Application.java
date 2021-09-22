package com.bridgelabz.birdsanctuary;

// Controller Layer
public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome To Bird Sanctuary.");
		
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
		
		birdRepository.add(crow);
		birdRepository.add(duck);
		birdRepository.add(eagle);
		birdRepository.add(penguin);
		birdRepository.add(pigeon);
		
		UserInterface userInterface = new UserInterface();
		
		userInterface.printAllBirds(birdRepository.getBirdList());
	}
}

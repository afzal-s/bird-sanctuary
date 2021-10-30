package com.bridgelabz.birdsanctuary;

import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.birdsanctuary.Bird.Color;
import com.bridgelabz.birdsanctuary.Bird.Gender;

// UI Layer
public class UserInterface {
	private static UserInterface UserInterfaceInstance;

	private UserInterface() {

	}

	public static synchronized UserInterface getInstance() {
		if (UserInterfaceInstance == null) {
			UserInterfaceInstance = new UserInterface();
		}
		return UserInterfaceInstance;
	}

	void printAllBirds(Set<Bird> birdList) {
		birdList.stream().forEach(System.out::println);
	}

	public void addBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		Bird bird = new Bird();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Bird Name: ");
		bird.name = scanner.nextLine();

		System.out.println("Enter Bird Id: ");
		bird.id = scanner.nextLine();

		setColor(bird);
		setGender(bird);

		System.out.println("Enter Bird Swimable? [True, False]: ");
		bird.isSwimAble = scanner.nextBoolean();
		System.out.println("Enter Bird Flyable? [True, False]: ");
		bird.isFlyAble = scanner.nextBoolean();

		birdRepository.add(bird);
	}

	private void setGender(Bird bird) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Bird Gender: \n" + "1. Male\n" + "2. Female");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			bird.gender = Gender.MALE;
			break;
		case 2:
			bird.gender = Gender.FEMALE;
		default:
			System.out.println("Enter Valid Data!");
			break;
		}
	}

	public void setColor(Bird bird) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter Bird Color: \n" + "1. White\n" + "2. Black\n" + "3. Grey\n" + "4. Green\n" + "5. Black & White");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			bird.color = Color.WHITE;
			break;
		case 2:
			bird.color = Color.BLACK;
			break;
		case 3:
			bird.color = Color.GREY;
			break;
		case 4:
			bird.color = Color.GREEN;
			break;
		case 5:
			bird.color = Color.BLACK_WHITE;
			break;
		}
	}

	public void updateBird() {
		Scanner scanner = new Scanner(System.in);
		UserInterface userInterface = UserInterface.getInstance();
		Bird bird = new Bird();

		System.out.print("\nEnter Bird Name To Update: ");
		String birdName = scanner.nextLine();
		BirdRepository birdRepository = BirdRepository.getInstance();
		Bird searchBird = birdRepository.getBird(birdName);

		boolean exit = false;

		while (!exit) {
			scanner = new Scanner(System.in);
			System.out.println("\nPRESS 1: Update Color \nPRESS 2: Update Id \nPRESS 3: Update Name"
					+ " \nPRESS 4: Update Gender \nPRESS 5: Exit");
			System.out.print("\nEnter Your Choice: ");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				setColor(bird);
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
				setGender(bird);
				break;
			case 5:
				exit = true;
				System.out.print("\n*** UPDATED!! ***\n");
				break;
			default:
				System.out.println("\n*** Error!! Invalid Input: " + "Enter 1, 2, 3, 4 To Update Or 5 To Exit. ***");
				break;
			}
		}
	}

	public void printSwimAble(Set<Bird> birdList) {
		birdList.stream().filter(bird -> bird.isFlyAble).forEach(System.out::println);
		/*
		.forEach(bird -> {
			if (bird.isFlyAble == true) {
				System.out.println(bird);
			}
		});
		*/
	}

	public void printFlyAble(Set<Bird> birdList) {
		birdList.stream().filter(bird -> bird.isSwimAble).forEach(System.out::println);
		
		/*
		birdList.stream().forEach(bird -> {
			if (bird.isSwimAble == true) {
				System.out.println(bird);
			}
		});
		*/
	}

}

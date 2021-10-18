package com.bridgelabz.birdsanctuary;

import java.util.Scanner;
import java.util.Set;

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
		for (Object object : birdList) {
			System.out.println(object);		
		}
	}

//	public void addBird() {
//		Scanner scanner = new Scanner(System.in);
//		
//	}
	
	/*
	void printAllBirds(List birdList) {
		for (int i = 0; i < birdList.size(); i++) {
			System.out.println(birdList.get(i));		
		}
	}
	 */
}

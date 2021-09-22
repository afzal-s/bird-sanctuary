package com.bridgelabz.birdsanctuary;

import java.util.List;

// UI Layer
public class UserInterface {
	/*
	void printAllBirds(List birdList) {
		for (int i = 0; i < birdList.size(); i++) {
			System.out.println(birdList.get(i));		
		}
	}
	*/
	
	void printAllBirds(List birdList) {
		for (Object object : birdList) {
			System.out.println(object);		
		}
	}
}

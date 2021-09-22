package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;

// Data Layer Or Model Layer. [CRUD]
public class BirdRepository {
	private ArrayList<Bird> birdList = new ArrayList<Bird>();

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public ArrayList getBirdList() {
		return birdList;
	}
}

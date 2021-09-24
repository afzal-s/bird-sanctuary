package com.bridgelabz.birdsanctuary;

import java.util.HashSet;
import java.util.Set;

// Data Layer Or Model Layer. [CURD]
public class BirdRepository {
	Set<Bird> birdList = new HashSet<Bird>();
	private static BirdRepository birdRepositoryInstance;
	
	private BirdRepository() {
	
	}
	
	public static synchronized BirdRepository getInstance() {
		if (birdRepositoryInstance == null) {
			birdRepositoryInstance = new BirdRepository();
		}
		return birdRepositoryInstance;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public Bird getBird(String name) {
		for (Bird bird : birdList) {
			if (bird.name.equalsIgnoreCase(name)) {
				return bird;
			}
		}
		return null;
	}
	
	public void removeBird(Bird bird) {
		birdList.remove(bird);
	}

	public Set<Bird> getBirdList() {
		return birdList;
	}
	
//	public void remove(Bird bird) {
//		birdList.remove(bird);
//	}
}

package com.bridgelabz.birdsanctuary;

public class Bird {
	String name;
	String color;
	String id;
	String gender;
	
	@Override
	public String toString() {
		return "Bird > Name: " + name + ", Color: " + color + ", ID: " + id + ", Gender: " + gender;
	}	
}

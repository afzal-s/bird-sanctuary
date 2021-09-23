package com.bridgelabz.birdsanctuary;

import java.util.Objects;

public class Bird {
	String name;
	String color;
	String id;
	String gender;
	
	@Override
	public String toString() {
		return "Bird > Name: " + name + ", Color: " + color + ", ID: " + id + ", Gender: " + gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}
}

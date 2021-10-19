package com.bridgelabz.birdsanctuary;

import java.util.Objects;

public class Bird {
	enum Color{WHITE, GREEN, BLACK_WHITE, BLACK, GREY};
	enum Gender{MALE, FEMALE};
	
	String name;
	Color color;
	String id;
	Gender gender;
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + ", id=" + id + ", gender=" + gender + "]";
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
		return id.equals(other.id);
	}
	
}

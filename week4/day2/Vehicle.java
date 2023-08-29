package week4.day2;

public class Vehicle {
	// Parent variable
	String brandName = "Honda";

	// constructor
	public Vehicle() {
		System.out.println("Vehicle constructor");
	}

   //parent method
	public void applyBrake() {
		System.out.println("applyBrake from vehicle class");
	}

	public void soundHorn() {
		System.out.println("SoundHorn from Vehicle class");
	}

}

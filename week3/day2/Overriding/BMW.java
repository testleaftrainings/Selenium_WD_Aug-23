package Overriding;

import week3.day2.Car;

public class BMW extends Car {

	public void applyBrake() {
		System.out.println("BMW ABS");
	}
	public void modelDetail() {
		System.out.println("BMW design");
	}
	
	public static void main(String[] args) {
		BMW  obj =new BMW();
		obj.applyBrake();
		obj.soundHorn();
		obj.modelDetail();
	}
}

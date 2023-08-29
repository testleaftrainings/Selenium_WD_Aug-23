package week4.day2;

public class Car extends Vehicle {
	String brandName="swift";
	//Constructor
	public  Car() {
		super();//parent Constructor
		System.out.println("Car Constructor");
	}
	//method level
	public void applyBrake() {
		super.applyBrake();
		System.out.println("BMW ABS");
	}
	public void modelDetail() {
		//variable level
		System.out.println(super.brandName);
		System.out.println(brandName);
	}
	
	public static void main(String[] args) {
		Car obj =new Car();
		obj.modelDetail();
		obj.applyBrake();
	}
}

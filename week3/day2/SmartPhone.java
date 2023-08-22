package week3.day2;

public class SmartPhone extends AndroidPhone {
	////Method overriding
	public void takeVideo() {
		System.out.println("AndroidPhone takeVideo");
	}
	public static void main(String[] args) {
		SmartPhone phone =new SmartPhone();
		phone.takeVideo();

	}

}

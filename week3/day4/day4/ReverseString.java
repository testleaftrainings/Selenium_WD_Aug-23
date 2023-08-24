package week3.day4;

public class ReverseString {

	public static void main(String[] args) {
		String  input = "TestLeaf";
		//convert string into charArray
		char[] charArray = input.toCharArray();
		
		for (int i =charArray.length-1 ; i>=0; i--) {
			System.out.println(charArray[i]);
		}
  System.out.println( charArray.toString() );
	}

}

package week3.day4;

public class FindCharCount {

	public static void main(String[] args) {
	
		String input="TestLeaf";
       //count of char e
		int count=0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e') {
				count++;
			}
		}
              System.out.println(count);
	}

}

package week3.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input="Hello this is me";
		//output hello siht is em
		//covert the string word
		//check if the index even---->reverse the string
		//print
		String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] ch = split[i].toCharArray();
				for (int j = ch.length-1; j>=0; j--) {
					System.out.print(ch[j]);
				}
				}
				else {
					System.out.print(split[i]);
				}
			System.out.print(" ");
			}
			
		}
	}

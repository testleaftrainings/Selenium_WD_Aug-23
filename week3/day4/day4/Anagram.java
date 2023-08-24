package week3.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="post";
		String s2="stop";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);//opst
		Arrays.sort(ch2);//opst
		 
		 for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]==ch2[i]) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		

	}

}

package week4.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name="TestlEaf";//Testlaf;
		char[] ch = name.toCharArray();
	
		Set<Character> cname=new LinkedHashSet<Character>();
		for (Character character : ch) {
			System.out.println(cname.add(character));
		}
		System.out.println(cname);

	}

}

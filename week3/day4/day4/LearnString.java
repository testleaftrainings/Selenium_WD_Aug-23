package week3.day4;

public class LearnString {

	public static void main(String[] args) {
		// String Literal
		String s1 = "Testleaf";
		String s2 = "TestLeaf";
		System.out.println(s1);
		// Using Instantiation
		String str = new String("Testleaf");
		// equals compare two string value
		System.out.println(s1.equals(str));
		// compare operator== reference(memory)
		System.out.println(s1 == str);
		// compare literal
		System.out.println(s1 == s2);
		//Compare two String content ignoring case
		System.out.println(s1.equalsIgnoreCase(s2));
		// count of my char
		int len = s1.length();
		System.out.println(s1.length());
		// Checks that a character exist or not in a given string   ex:leaf
		System.out.println(s1.contains("leaf"));
		// charAt(index)
		System.out.println(s1.charAt(5));
		// toCharArray 'T''e' '''s'
		char[] ch = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			// System.out.println(ch[i]);
		}
		// reverse the string
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

		String s3 = "Testleaf 60 Located in chennai 1999";
		// split
		String[] split = s3.split(" ");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		// replace
		String replace = s3.replace('e', 'a');
		System.out.println(replace);
		// replaceAll()

		String replaceAll = s3.replaceAll("[^0-9]", "");// print only number
		System.out.println(replaceAll);
		// print only number
		System.out.println(s3.replaceAll("\\d", ""));

		// substring
		System.out.println(s3.substring(14));
		// substring
		System.out.println(s3.substring(9, 11));
		//
		String browser1 = "Chrome";
		String browser2 = "Edge";
		System.out.println(browser1.toLowerCase());
		System.out.println(browser1.toUpperCase());
		// concat
		System.out.println(browser1 + browser2);
		System.out.println(browser1.concat(browser2));
		System.out.println("Input" + " "+browser1);

		// trim
		String output = "      CRM/SFA         ";
		System.out.println(output.trim());

	}

}

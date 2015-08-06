import java.util.ArrayList;

public class Array_And_Strings {
	public boolean isUniqueString(String s) {
		boolean isUnique = true;
		s = s.toLowerCase();
		ArrayList character = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			if (character.contains(s.charAt(i))) {
				isUnique = false;
				break;
			} else {
				character.add(s.charAt(i));
			}
		}

		return isUnique;
	}
	

	public boolean isUniqueChars2(String str) 
	{
		if (str.length() > 256) return false;
		
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str. length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		 }
		 return true;
	}

	public static void main(String[] args) {
		Array_And_Strings as = new Array_And_Strings();
		if (as.isUniqueString("Heloph"))
			System.out.println("True");
		else
			System.out.println("False");
		
		String s = "Hello World";
		int c = s.charAt(2);
		System.out.println(s.charAt(2));
		System.out.println(c);
		
	}

}

import java.util.Arrays;


public class Anagrams {
	
	public boolean isAnagram(String s1, String s2)
	{
		if (s1.length() != s2.length()) return false;
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(sortString(s1).equals(sortString(s2)))
			return true;
		
		return false;
		
	}
	
	public String sortString(String s1)
	{
		char[] c = s1.toCharArray();
		Arrays.sort(c);
		String s = new String(c);
		
		return s;
	}
	
	public static void main(String[] args)
	{
		Anagrams a = new Anagrams();
		System.out.println(a.isAnagram("Hello", "ohlel"));
	}

}

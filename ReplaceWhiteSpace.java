import java.util.ArrayList;


public class ReplaceWhiteSpace {
	
	public static String filterSpace(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' '){
			s =  replaceSpace(s,i);
				
			}
		}
		
		return s;
	}
	
	public static String replaceSpace(String s, int pos)
	{
	
		return s.substring(0, pos)+"%20"+s.substring(pos+1);
	}
	
	
	public static void main(String []args)
	{
		System.out.println(filterSpace("Hello world"));
	
	
	}

}

import java.util.ArrayList;


public class NullTerminatedString {
	
	public void NTString (String s)
	{
		int stringLength = s.length();
		ArrayList ntString = new ArrayList();
		for(int i=0; i < stringLength; i++ ){
			ntString.add( s.charAt(i));
		}
		ntString.add("0/");
		
		System.out.println(ntString);
	}
	
	public static void main(String[] args)
	{
		NullTerminatedString n = new NullTerminatedString();
		n.NTString("hello");
	}

}

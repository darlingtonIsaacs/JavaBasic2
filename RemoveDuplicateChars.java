
public class RemoveDuplicateChars {

	public String removeDublicate(String s)
	{
		s = s.toLowerCase();
		for(int i=0; i<s.length();i++)
		{
			int c=s.charAt(i);
			for(int ii=i+1; ii<s.length();ii++)
			{
				int cc = s.charAt(ii);
				if(c==cc){
					s=removeChar(s,ii);
					i=0;
				}
			}
		}
		return s;
	}
	
	
	public String removeChar(String s, int pos)
	{
		return s.substring(0, pos)+s.substring(pos+1);
	}
	
	//from book
	public static void removeDuplicates(char[] str)
	{
		if(str == null) return;
		int len = str.length;
		if(len < 2) return;
		
		int tail = 1;
		
		for(int i=1; i<len; ++i)
		{
			int j;
			for(j=0; j<tail; ++j)
			{
				if(str[i]==str[j]){
					break;
				}
			}
			if(j==tail){
				str[tail] = str[i];
				++tail;
			}
		}
		//System.out.println(str[0]);
		//str[tail]=0;
	}
	
	public static void main(String[] args)
	{
		RemoveDuplicateChars r=new RemoveDuplicateChars();
		System.out.println(r.removeDublicate("HelllloooohelopeopleHehovah"));
		//char[] srcArray = {'K', 'E','E','K','L'};
		//removeDuplicates(srcArray);
		
	}
	
}

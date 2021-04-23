package bom;

public class Java 
{
	public static void main(String[] args) 
	{
		String str = "Hi WHY bEHAVE Genious";
		String and ="";
		for(int i=0;i<=str.length();i++)
		{
			char ch = str.charAt(i);
			char ch1 = ' ';
		
			if(ch>='a' && ch<='z')
			{
				ch1 = (char)(ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				ch1 = (char)(ch+32);
			}
				and = and + ch1;
		}
		System.out.println(and);

	}
}



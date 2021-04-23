package bom;

public class Test 
{
	public static void main(String[] args) 
	{
		String s = "Hi WHY bECHOME Genious";
		
		String war ="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			char l=' ';
			boolean c = Character.isLowerCase(ch);
			if(c)
			{
				war = war +Character.toUpperCase(ch);
			}
			else
			{
				war=war+Character.toLowerCase(ch);
			}
		
		}
		System.out.println(war);
	}
}

	